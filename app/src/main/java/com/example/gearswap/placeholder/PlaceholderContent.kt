package com.example.gearswap.placeholder

import java.util.Locale

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, PlaceholderItem> = HashMap()

    private val COUNT = 20 // Number of placeholder items

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem(i))
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
        ITEM_MAP[item.id] = item
    }

    private fun createPlaceholderItem(position: Int): PlaceholderItem {
        return PlaceholderItem(
            id = position.toString(),
            title = "Gear $position",
            description = "Description for Gear $position",
            price = position * 5.0,
            //fixme: Get Network Permission and Replace with a real image URL
            imageUrl = "https://example.com/images/gear$position.jpg"
        )
    }

    /**
     * A placeholder item representing a piece of gear with details.
     */
    data class PlaceholderItem(
        val id: String,
        val title: String,
        val description: String,
        val price: Double,
        val imageUrl: String
    ) {
        /**
         * Returns a string containing the title, price, description, and image URL,
         * separated by commas for logging purposes.
         */
        override fun toString(): String {
            return "ID: $id, Title: $title, Price: Price: \$${
                String.format(
                    Locale.US,
                    "%.2f",
                    price
                )
            }, Description: $description, Image URL: $imageUrl"
        }
    }
}

