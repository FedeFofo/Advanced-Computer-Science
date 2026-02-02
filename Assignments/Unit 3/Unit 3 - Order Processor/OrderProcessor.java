public class OrderProcessor {
    // Explaination:
    // I tried to figure out every single stop that processCustomerOrder did, from going through a
    // for loop to calculate the subtotal, counting "premium" items, printing out item-by-item
    // messages, calculating tax & total, & printing an order summary. I made a helper message to
    // represent every one of these internal steps, and, in a couple of cases of complexity, I made
    // an extra helper method (isPremiumItem, countPremiumItems). This way, the end product has
    // about 1 responsibility per method so things are now a lot less chaotic.

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = calculateSubtotal(items);

        String[] premiumItems = collectPremiumItems(items);

        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);

        printOrderSummary(subtotal, tax, total, premiumItems.length);

        return new OrderSummary(total, subtotal, tax, premiumItems);
    }

    // Helper Methods

    private static double calculateSubtotal(Item[] items) {
        double subtotal = 0;
        for (int i = 0; i < items.length; i++) {
            subtotal += items[i].getPrice() * items[i].getQuantity();
            printItemType(items[i]);
        }
        return subtotal;
    }

    private static boolean isPremiumItem(Item item) {
        return item.getPrice() > 50.0;
    }

    private static void printItemType(Item item) {
        if (isPremiumItem(item)) {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
    }

    private static String[] collectPremiumItems(Item[] items) {
        int premiumCount = countPremiumItems(items);
        String[] premiumItems = new String[premiumCount];
        int index = 0;
        for (int i = 0; i < items.length; i++) {
            if (isPremiumItem(items[i])) {
                premiumItems[index] = items[i].getName();
                index++;
            }
        }
        return premiumItems;
    }

    private static int countPremiumItems(Item[] items) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (isPremiumItem(items[i])) {
                count++;
            }
        }
        return count;
    }

    private static double calculateTax(double subtotal, double taxRate) {
        return subtotal * taxRate;
    }

    private static double calculateTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    private static void printOrderSummary(double subtotal, double tax, double total,
            int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }
}
