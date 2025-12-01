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
    // Пример использования
    vector<int> numbers = {5, 2, 8, 1, 9, 3};
    int maxNumber = findMax(numbers);
    
    cout << "Максимальное число: " << maxNumber << endl;
    
    return 0;
}
