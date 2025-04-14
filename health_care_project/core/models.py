from django.db import models

class Patient(models.Model):
    GENDER_CHOICES = (
        ('M', 'Male'),
        ('F', 'Female'),
        ('O', 'Other'),
    )
    name = models.CharField(max_length=100)
    age = models.IntegerField(null=False, blank=False)
    gender = models.CharField(max_length=1, choices=GENDER_CHOICES,default='M')
    email = models.EmailField(unique=True)
    phone = models.CharField(max_length=10,unique=True)
    address = models.TextField()

    def __str__(self):
        return self.name

class Doctor(models.Model):
    name = models.CharField(max_length=100)
    specialization = models.CharField(max_length=100)
    email = models.EmailField()
    phone = models.CharField(max_length=15)

    def __str__(self):
        return f"{self.name} - {self.specialization}"

class Appointment(models.Model):
    patient = models.ForeignKey(Patient, on_delete=models.CASCADE)
    doctor = models.ForeignKey(Doctor, on_delete=models.CASCADE)
    date = models.DateField()
    time = models.TimeField()
    description = models.TextField()

    def __str__(self):
        return f"{self.patient.name} with {self.doctor.name} on {self.date}"


# Create your models here.
