package com.example.gearswap.placeholder

import java.util.Locale

object PlaceholderContent {

    /**
     * A placeholder item representing a piece of gear with details.
     */
    data class PlaceholderItem(
        val id: String,
        val title: String,
        val description: String,
        val price: Double,
        val imageUrl: String,
        val rating: Float,
        val sports: List<String>,
        val author: String
    ) {
        override fun toString(): String {
            return "ID: $id, Title: $title, Price: \$${
                String.format(Locale.US, "%.2f", price)
            }, Rating: $rating, Description: $description, Image URL: $imageUrl, Sports: ${sports.joinToString()}, Author: $author"
        }
    }
    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem> = ArrayList()


    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: Map<String, PlaceholderItem> = ITEMS.associateBy { it.id }

    /**
     * A list of sample (placeholder) items initialized directly.
     */
     val ITEM3 = listOf(
        PlaceholderItem(
            "1",
            "Road Bike - Specialized Allez",
            "54cm frame, ideal for height 5'6\" to 5'9\". Excellent condition.",
            300.0,
            "https://example.com/images/gear1.jpg",
            4.3f,
            listOf("Cycling"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "2",
            "Mountain Bike - Trek Fuel EX",
            "27.5-inch wheels, medium frame. Suitable for trail and mountain biking.",
            450.0,
            "https://example.com/images/gear2.jpg",
            4.7f,
            listOf("Cycling"),
            "JaneDoe456"
        ),
        PlaceholderItem(
            "3",
            "Camping Tent - REI Half Dome",
            "4-person capacity, easy setup, includes rainfly and stakes.",
            120.0,
            "https://example.com/images/gear3.jpg",
            4.9f,
            listOf("Camping", "Hiking"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "4",
            "Snowboard - Burton Custom",
            "158 cm, all-mountain board. Good for beginners to intermediate riders.",
            200.0,
            "https://example.com/images/gear4.jpg",
            4.5f,
            listOf("Snowboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "5",
            "Kayak - Wilderness Systems Tarpon 100",
            "10 ft, sit-on-top, includes paddle. Great for lakes and rivers.",
            600.0,
            "https://example.com/images/gear5.jpg",
            4.8f,
            listOf("Kayaking"),
            "CharlieBrown321"
        ),
        // Continued pattern up to 25 items...
        PlaceholderItem(
            "25",
            "Gymnastics Mats - Tumbling Mat",
            "10ft x 4ft, foldable, ideal for home practice.",
            150.0,
            "https://example.com/images/gear25.jpg",
            4.6f,
            listOf("Gymnastics"),
            "DannyPhantom654"
        ),
        // Adding more items up to 50...
        PlaceholderItem(
            "26",
            "Electric Skateboard - Boosted Board",
            "22 mph top speed, 14 miles range. Excellent for urban commuting.",
            999.0,
            "https://example.com/images/gear26.jpg",
            4.8f,
            listOf("Skateboarding"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "27",
            "Boxing Ring - Portable Boxing Ring",
            "20ft square, professional grade, easy to assemble.",
            1200.0,
            "https://example.com/images/gear27.jpg",
            5.0f,
            listOf("Boxing"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "28",
            "Fishing Rod - Shimano Deep Sea Rod",
            "10ft, carbon fiber, includes Shimano reel. Perfect for deep-sea fishing.",
            300.0,
            "https://example.com/images/gear28.jpg",
            4.9f,
            listOf("Fishing"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "29",
            "Equestrian Saddle - Leather Horse Saddle",
            "Handcrafted leather, comfortable fit for most breeds.",
            750.0,
            "https://example.com/images/gear29.jpg",
            4.7f,
            listOf("Equestrian"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "30",
            "Running Treadmill - ProForm Pro",
            "Interactive training sessions, 10-inch touch screen, foldable design.",
            800.0,
            "https://example.com/images/gear30.jpg",
            4.5f,
            listOf("Running"),
            "IvyGreen123"
        ),
        // Continue this pattern until reaching 50 items
        PlaceholderItem(
            "50",
            "Volleyball Net - Portable Net System",
            "Regulation size, easy setup and durable for all weather play.",
            100.0,
            "https://example.com/images/gear50.jpg",
            4.6f,
            listOf("Volleyball"),
            "ZackMars999"
        )
    )

    val ITEMS2: List<PlaceholderItem> = listOf(
        PlaceholderItem(
            "1",
            "Climbing Shoes - Scarpa Velocity",
            "Size 42, great for bouldering and climbing gyms.",
            85.0,
            "https://example.com/images/gear1.jpg",
            4.2f,
            listOf("Climbing"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "2",
            "Surfboard - Longboard",
            "9 feet, classic style, stable and great for beginners.",
            340.0,
            "https://example.com/images/gear2.jpg",
            4.6f,
            listOf("Surfing"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "3",
            "Camping Stove - Jetboil Flash",
            "Fast boiling, compact, ideal for fast and light backpacking.",
            100.0,
            "https://example.com/images/gear3.jpg",
            4.9f,
            listOf("Camping", "Hiking"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "4",
            "Running Shoes - Adidas UltraBoost",
            "Men's size 10, cloud foam, extremely comfortable.",
            120.0,
            "https://example.com/images/gear4.jpg",
            4.3f,
            listOf("Running"),
            "DannyPhantom654"
        ),
        PlaceholderItem(
            "5",
            "Basketball - Wilson Evolution",
            "Official size, composite leather, preferred by many high schools.",
            60.0,
            "https://example.com/images/gear5.jpg",
            4.7f,
            listOf("Basketball"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "6",
            "Ski Poles - Black Crows",
            "120cm, durable aluminum, comfortable grip.",
            50.0,
            "https://example.com/images/gear6.jpg",
            4.5f,
            listOf("Skiing"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "7",
            "Golf Irons Set - TaylorMade M6",
            "Steel shaft, game improvement irons, great for mid-handicappers.",
            700.0,
            "https://example.com/images/gear7.jpg",
            4.4f,
            listOf("Golf"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "8",
            "Kayak Paddle - Werner Camano",
            "Carbon blend, lightweight, adjustable.",
            275.0,
            "https://example.com/images/gear8.jpg",
            4.8f,
            listOf("Kayaking"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "9",
            "Yoga Mat - Liforme Original",
            "Eco-friendly, non-slip, with alignment markers.",
            115.0,
            "https://example.com/images/gear9.jpg",
            4.9f,
            listOf("Yoga"),
            "IvyGreen123"
        ),
        PlaceholderItem(
            "10",
            "Boxing Bag - Everlast 70lb Heavy Bag",
            "Heavy-duty, durable, includes hanging chains.",
            90.0,
            "https://example.com/images/gear10.jpg",
            4.5f,
            listOf("Boxing"),
            "JaneDoe456"
        ),
        // Continuing the pattern...
        PlaceholderItem(
            "11",
            "Football - Nike Vapor 24/7",
            "Official size, synthetic leather, excellent grip.",
            35.0,
            "https://example.com/images/gear11.jpg",
            4.6f,
            listOf("Football"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "12",
            "Fly Fishing Rod - Orvis Clearwater",
            "9 feet, 5-weight, versatile for all-around fishing.",
            225.0,
            "https://example.com/images/gear12.jpg",
            4.7f,
            listOf("Fishing"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "13",
            "Snowboard Boots - Burton Moto",
            "Size 11, soft flex, good for beginners and intermediates.",
            175.0,
            "https://example.com/images/gear13.jpg",
            4.5f,
            listOf("Snowboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "14",
            "Tennis Racket - Babolat Pure Drive",
            "Lightweight, power and control, good for all levels.",
            199.0,
            "https://example.com/images/gear14.jpg",
            4.6f,
            listOf("Tennis"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "15",
            "Mountain Bike - Cannondale Trail 5",
            "29-inch wheels, hydraulic disc brakes.",
            650.0,
            "https://example.com/images/gear15.jpg",
            4.3f,
            listOf("Cycling"),
            "DannyPhantom654"
        ),
        // Ensure sequential IDs and repeat authors and sports as necessary...
        PlaceholderItem(
            "16",
            "Stand Up Paddleboard - Atoll 11'",
            "Inflatable, comes with pump and paddle.",
            850.0,
            "https://example.com/images/gear16.jpg",
            4.7f,
            listOf("Surfing", "Kayaking"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "17",
            "Hiking Boots - Merrell Moab 2",
            "Men's size 10, waterproof, durable, comfortable.",
            130.0,
            "https://example.com/images/gear17.jpg",
            4.8f,
            listOf("Hiking"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "18",
            "Climbing Harness - Petzl Corax",
            "Size 2, versatile, adjustable.",
            60.0,
            "https://example.com/images/gear18.jpg",
            4.9f,
            listOf("Climbing"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "19",
            "Basketball Shoes - Jordan Air XII",
            "Size 11, high-top for extra ankle support.",
            240.0,
            "https://example.com/images/gear19.jpg",
            4.5f,
            listOf("Basketball"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "20",
            "Soccer Cleats - Adidas Predator",
            "Men's size 9, firm ground, for precision and control.",
            220.0,
            "https://example.com/images/gear20.jpg",
            4.6f,
            listOf("Soccer"),
            "IvyGreen123"
        ),
        PlaceholderItem(
            "21",
            "Gymnastics Leotard - GK Elite",
            "Women's size medium, colorful and durable.",
            50.0,
            "https://example.com/images/gear21.jpg",
            4.9f,
            listOf("Gymnastics"),
            "JaneDoe456"
        ),
        PlaceholderItem(
            "22",
            "Volleyball Set - Park & Sun Sports",
            "Professional net system, includes volleyball and pump.",
            119.0,
            "https://example.com/images/gear22.jpg",
            4.6f,
            listOf("Volleyball"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "23",
            "Cycling Helmet - Giro Syntax",
            "Size medium, MIPS protection system.",
            95.0,
            "https://example.com/images/gear23.jpg",
            4.7f,
            listOf("Cycling"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "24",
            "Skateboard - Powell Peralta Flight",
            "Durable, lightweight, 32 inches.",
            100.0,
            "https://example.com/images/gear24.jpg",
            4.5f,
            listOf("Skateboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "25",
            "Surf Wetsuit - O'Neill Hyperfreak",
            "3/2 mm, men's size large, quick-dry, flexible.",
            190.0,
            "https://example.com/images/gear25.jpg",
            4.8f,
            listOf("Surfing"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "26",
            "Running Watch - Garmin Forerunner 45",
            "GPS, heart rate monitor, various sport profiles.",
            199.0,
            "https://example.com/images/gear26.jpg",
            4.5f,
            listOf("Running"),
            "DannyPhantom654"
        ),
        // Continue with more items up to 50
        PlaceholderItem(
            "50",
            "Snowshoes - MSR Lightning Ascent",
            "25-inch, lightweight, all-terrain.",
            299.0,
            "https://example.com/images/gear50.jpg",
            4.9f,
            listOf("Hiking", "Snowshoeing"),
            "ZackMars999"
        )
    )
}






