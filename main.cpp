#include <iostream>
#include <vector>
#include <climits>
using namespace std;

// Метод для нахождения максимума в списке
int findMax(const vector<int>& numbers) {
    if (numbers.empty()) {
        return INT_MIN;
    }
    
    int max = numbers[0];
    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
    }
    return max;
}

int main() {
    int n;
    
    // Ввод количества элементов
    cout << "Введите количество элементов: ";
    cin >> n;
    
    if (n <= 0) {
        cout << "Количество элементов должно быть положительным!" << endl;
        return 1;
    }
    
    // Ввод элементов массива
    vector<int> numbers(n);
    cout << "Введите " << n << " элементов:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Элемент " << i + 1 << ": ";
        cin >> numbers[i];
    }
    
    // Нахождение максимума
    int maxNumber = findMax(numbers);
    
    // Вывод результата
    cout << "Максимальное число: " << maxNumber << endl;
    
    return 0;
}
