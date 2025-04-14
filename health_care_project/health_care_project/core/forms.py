from django import forms
from .models import Patient
from .models import Appointment

class AppointmentForm(forms.ModelForm):
    class Meta:
        model = Appointment
        fields = ['patient', 'doctor', 'date', 'time', 'description']

    widgets = {
        'date': forms.DateInput(attrs={'type': 'date', 'class': 'form-control'}),
        'time': forms.TimeInput(attrs={'type': 'time', 'class': 'form-control'}),
        'description': forms.Textarea(attrs={'class': 'form-control', 'rows': 3}),
    }
    def __init__(self, *args, **kwargs):
        super(AppointmentForm, self).__init__(*args, **kwargs)
        for field in self.fields:
            if field not in ['date', 'time', 'description']:  # already styled above
                self.fields[field].widget.attrs.update({'class': 'form-control'})
class PatientForm(forms.ModelForm):
    class Meta:
        model = Patient
        fields = ['name', 'age', 'gender', 'email', 'phone', 'address']

    def __init__(self, *args, **kwargs):
        super(PatientForm, self).__init__(*args, **kwargs)
        for field in self.fields.values():
            field.widget.attrs.update({'class': 'form-control'})
