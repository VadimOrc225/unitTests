package seminars.fourth.card;

import org.junit.jupiter.api.Test;
import org.mockito.NotExtensible;
import org.mockito.verification.VerificationMode;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.*;

class TestPayment{
@Test
public void testPaymentForm() {
    CreditCard mockCreditCard = mock(CreditCard.class);
    when(mockCreditCard.getCardNumber()).thenReturn("123456789");
    when(mockCreditCard.getCardHolder()).thenReturn("Mister Twister");
    when(mockCreditCard.getExpiryDate()).thenReturn("04/05");
    when(mockCreditCard.getCvv()).thenReturn("333");

    PaymentForm mockPaymentForm = new PaymentForm(mockCreditCard);
    mockPaymentForm.pay(100);

verify(mockCreditCard, times(1)).charge(100);
}}
    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */



