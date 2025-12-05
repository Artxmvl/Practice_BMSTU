#include <iostream>
#include <vector>

int findMin(const std::vector<int>& list) {
    int min = list[0];
    for (int i = 1; i < list.size(); i++) {
        if (list[i] < min) {
            min = list[i];
        }
    }
    return min;
}

int main() {
    int n;
    std::cout << "Enter number of elements: ";
    std::cin >> n;
    
    std::vector<int> numbers(n);
    std::cout << "Enter elements: ";
    for (int i = 0; i < n; i++) {
        std::cin >> numbers[i];
    }
    
    std::cout << "Minimum: " << findMin(numbers) << std::endl;
    return 0;
}
