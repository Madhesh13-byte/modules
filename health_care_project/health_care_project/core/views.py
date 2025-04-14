from django.shortcuts import render, redirect
from .forms import PatientForm
from .models import Patient
from django.contrib import messages
from .forms import AppointmentForm
from django.core.mail import send_mail


def book_appointment(request):
    if request.method == 'POST':
        form = AppointmentForm(request.POST)
        if form.is_valid():
            appointment = form.save()  # Save once here

            # Send confirmation email
            subject = 'Appointment Confirmation'
            message = f'''Hello {appointment.patient.name},

Your appointment with Dr. {appointment.doctor.name} is confirmed for {appointment.date} at {appointment.time}.

Thank you for booking with us!

- Healthcare System'''
            recipient = [appointment.patient.email]

            try:
                send_mail(
                    subject,
                    message,
                    'abchospital13@gmail.com',  # Make sure this email is valid & configured
                    recipient,
                    fail_silently=False,
                )
            except Exception as e:
                print("Error sending email:", e)

            return redirect('appointment_thank_you')  # ✅ Make sure this URL name exists in urls.py
    else:
        form = AppointmentForm()
    return render(request, 'core/appointment.html', {'form': form})
def home(request):
    return render(request, 'core/home.html')

def register_patient(request):
    if request.method == 'POST':
        form = PatientForm(request.POST)
        if form.is_valid():
            email = form.cleaned_data['email']
            phone = form.cleaned_data['phone']

            # Check if patient already exists by email or phone
            if Patient.objects.filter(email=email).exists() or Patient.objects.filter(phone=phone).exists():
                messages.warning(request, "You have already registered with this email or phone number.")
                return redirect('register')

            # If not exists, save and show success
            form.save()
            messages.success(request, "Patient registered successfully!")
            return redirect('thank_you')
    else:
        form = PatientForm()
    return render(request, 'core/register.html', {'form': form})
def patient_list(request):
    patients = Patient.objects.all()
    return render(request, 'core/patient_list.html', {'patients': patients})
def thank_you(request):
    return render(request, 'core/thank_you.html')
def appointment_thank_you(request):
    return render(request, 'core/thank_you.html')
