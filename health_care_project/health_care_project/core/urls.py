from django.urls import path
from . import views

urlpatterns = [
    path('', views.home, name='home'),
    path('register/', views.register_patient, name='register_patient'),
    path('patients/', views.patient_list, name='patient_list'),
    path('thank-you/', views.thank_you, name='thank_you'),
    path('book/', views.book_appointment, name='book_appointment'),
path('thank-you/', views.appointment_thank_you, name='appointment_thank_you'),
]
