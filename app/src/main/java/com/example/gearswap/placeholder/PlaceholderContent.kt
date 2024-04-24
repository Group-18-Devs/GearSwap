package com.example.gearswap.placeholder

import java.util.Locale

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
//fixme: Get Network Permission and Replace with a real image URL

object PlaceholderContent {

    /**
     * A placeholder item representing a piece of gear with details.
     */
    data class PlaceholderItem(
        val id: String,
        val title: String,
        val shortDescription: String,
        val price: Double,
        val imageUrl: String,
        val rating: Float,
        val sports: List<String>,
        val author: String
    ) {
        override fun toString(): String {
            return "ID: $id, Title: $title, Price: \$${
                String.format(Locale.US, "%.2f", price)
            }, Rating: $rating, Description: $shortDescription, Image URL: $imageUrl, Sports: ${sports.joinToString()}, Author: $author"
        }
    }
    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS = mutableListOf(
        PlaceholderItem(
            "1",
            "Climbing Shoes - Scarpa Velocity",
            "Size 42, great for bouldering and climbing gyms.",
            85.0,
            "https://climbinggearreviews.com/wp-content/uploads/2020/03/scarpa-velocity-climbing-shoe.jpg?w=1000",
            4.2f,
            listOf("Climbing"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "2",
            "Surfboard - Longboard",
            "9 feet, classic style, stable and great for beginners.",
            340.0,
            "https://www.surfstationstore.com/cdn/shop/products/modern_retro_blu_5000x.jpg?v=1704999623",
            4.6f,
            listOf("Surfing"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "3",
            "Camping Stove - Jetboil Flash",
            "Fast boiling, compact, ideal for fast and light backpacking.",
            100.0,
            "https://backpackeroutdoors.com/cdn/shop/files/jetboil-flash-cooking-system-34241288700064_720x.png?v=1685564900",
            4.9f,
            listOf("Camping", "Hiking"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "4",
            "Running Shoes - Adidas UltraBoost",
            "Men's size 10, cloud foam, extremely comfortable.",
            120.0,
            "https://assets.adidas.com/images/w_600,f_auto,q_auto/4cb7f45b21a64881a2ccad1d017daec3_9366/Racer_TR21_Shoes_Black_GZ8184_01_standard.jpg",
            1.0f,
            listOf("Running"),
            "DannyPhantom654"
        ),
        PlaceholderItem(
            "5",
            "Basketball - Wilson Evolution",
            "Official size, composite leather, preferred by many high schools.",
            60.0,
            "https://m.media-amazon.com/images/I/818bVxYc15L.__AC_SX300_SY300_QL70_FMwebp_.jpg",
            4.7f,
            listOf("Basketball"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "6",
            "Ski Poles - Black Crows",
            "120cm, durable aluminum, comfortable grip.",
            50.0,
            "https://www.black-crows.com/dw/image/v2/BFHK_PRD/on/demandware.static/-/Sites-black-crows-master-catalog/default/dw8a05bc28/images/hi-res/101722-005-F.jpg?sw=650&sh=720&sm=fit&q=100",
            4.5f,
            listOf("Skiing"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "7",
            "Golf Irons Set - TaylorMade M6",
            "Steel shaft, game improvement irons, great for mid-handicappers.",
            700.0,
            "https://m.media-amazon.com/images/I/71coig4FEoL.__AC_SX300_SY300_QL70_FMwebp_.jpg",
            4.4f,
            listOf("Golf"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "8",
            "Kayak Paddle - Werner Camano",
            "Carbon blend, lightweight, adjustable.",
            275.0,
            "https://m.media-amazon.com/images/I/41a6RJuQblL.__AC_SX300_SY300_QL70_FMwebp_.jpg",
            4.8f,
            listOf("Kayaking"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "9",
            "Yoga Mat - Liforme Original",
            "Eco-friendly, non-slip, with alignment markers.",
            115.0,
            "https://d1nymbkeomeoqg.cloudfront.net/photos/28/48/406367_28460_XL.jpg",
            1.0f,
            listOf("Yoga"),
            "IvyGreen123"
        ),
        PlaceholderItem(
            "10",
            "Boxing Bag - Everlast 70lb Heavy Bag",
            "Heavy-duty, durable, includes hanging chains.",
            90.0,
            "https://i5.walmartimages.com/seo/Everlast-70-lb-Poly-Canvas-Red-Heavy-Bag-Kit_8599a4cf-c146-49d6-a4d2-6fb5d6087e7c_1.bf7779d7d261a28494936de5d5be4959.jpeg",
            2.3f,
            listOf("Boxing"),
            "JaneDoe456"
        ),
        PlaceholderItem(
            "11",
            "Football - Nike Vapor 24/7",
            "Official size, synthetic leather, excellent grip.",
            35.0,
            "https://static.nike.com/a/images/t_PDP_1728_v1/f_auto,q_auto:eco/86e7cf7f-a3b1-4896-b3df-70a9291d9805/tournament-football-9TQdv2.png",
            3.7f,
            listOf("Football"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "12",
            "Fly Fishing Rod - Orvis Clearwater",
            "9 feet, 5-weight, versatile for all-around fishing.",
            225.0,
            "https://www.andythornal.com/cdn/shop/products/194e847d4c891dda3722ea2ee17260e65eeeca0e.jpg?v=1661029478",
            4.7f,
            listOf("Fishing"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "13",
            "Snowboard Boots - Burton Moto",
            "Size 11, soft flex, good for beginners and intermediates.",
            175.0,
            "https://www.burton.com/static/product/W24/10436105001_1.png",
            4.5f,
            listOf("Snowboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "14",
            "Tennis Racket - Babolat Pure Drive",
            "Lightweight, power and control, good for all levels.",
            199.0,
            "https://media.babolat.com/image/upload/v1599652999/Website_content/Tennis_news/pure_drive/Babolat_NEWS-ImgCentree_557x369_PureDrive21-1.jpg",
            4.6f,
            listOf("Tennis"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "15",
            "Mountain Bike - Cannondale Trail 5",
            "29-inch wheels, hydraulic disc brakes.",
            650.0,
            "https://cdn-tp2.mozu.com/11961-16493/cms/16493/files/P77050052390002115_3.jpg?max=700&quality=60&_mzCb=_1713545867446",
            4.3f,
            listOf("Cycling"),
            "DannyPhantom654"
        ),
        PlaceholderItem(
            "16",
            "Stand Up Paddleboard - Atoll 11'",
            "Inflatable, comes with pump and paddle.",
            850.0,
            "https://atollboards.com/wp-content/uploads/2022/03/Light-Blue-Atoll-11-foot-Inflatable-Paddle-Board-Package-e1654617360981-1024x1024-min.jpg",
            4.7f,
            listOf("Surfing", "Kayaking"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "17",
            "Hiking Boots - Merrell Moab 2",
            "Men's size 10, waterproof, durable, comfortable.",
            130.0,
            "https://m.media-amazon.com/images/I/714GP9v4ojL._AC_UY300_DpWeblab_.jpg",
            4.8f,
            listOf("Hiking"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "18",
            "Climbing Harness - Petzl Corax",
            "Size 2, versatile, adjustable.",
            60.0,
            "https://m.media-amazon.com/images/I/71R7Mw7yTCL._AC_UY1000_DpWeblab_.jpg",
            4.9f,
            listOf("Climbing"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "19",
            "Basketball Shoes - Jordan Air XII",
            "Size 11, high-top for extra ankle support.",
            240.0,
            "https://static.nike.com/a/images/t_PDP_1280_v1/f_auto,q_auto:eco,u_126ab356-44d8-4a06-89b4-fcdcc8df0245,c_scale,fl_relative,w_1.0,h_1.0,fl_layer_apply/8b99d703-18ef-431a-8f21-eedb4ddc6a83/air-jordan-12-retro-mens-shoes-9rPt0x.png",
            4.5f,
            listOf("Basketball"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "20",
            "Soccer Cleats - Adidas Predator",
            "Men's size 9, firm ground, for precision and control.",
            220.0,
            "https://assets.adidas.com/images/w_600,f_auto,q_auto/1794f4aa7b9847799281cab3c2f3421f_9366/Predator_Accuracy_Firm_Ground_Soccer_Cleats_White_GZ2604_HM1.jpg",
            4.6f,
            listOf("Soccer"),
            "IvyGreen123"
        ),
        PlaceholderItem(
            "21",
            "Gymnastics Leotard - GK Elite",
            "Women's size medium, colorful and durable.",
            50.0,
            "https://img.creator-prod.zmags.com/assets/images/64da90896df9f10f7604ca30.jpeg?im=Resize,width=768",
            4.9f,
            listOf("Gymnastics"),
            "JaneDoe456"
        ),
        PlaceholderItem(
            "22",
            "Volleyball Set - Park & Sun Sports",
            "Professional net system, includes volleyball and pump.",
            119.0,
            "https://mobileimages.lowes.com/productimages/6303cc7d-c9bd-477c-80a2-0f3abad2b4e3/14271194.jpg",
            4.6f,
            listOf("Volleyball"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "23",
            "Cycling Helmet - Giro Syntax",
            "Size medium, MIPS protection system.",
            95.0,
            "https://m.media-amazon.com/images/I/61LQRPaDLkL._AC_UF1000,1000_QL80_DpWeblab_.jpg",
            4.7f,
            listOf("Cycling"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "24",
            "Skateboard - Powell Peralta Flight",
            "Durable, lightweight, 32 inches.",
            100.0,
            "https://images.squarespace-cdn.com/content/5cba056fda50d32c39cf43f2/1556051398825-3HSAKRPQX74LXLA0W5MO/powell-peralta-flight-decks-all-models-and-colors_850x.gif?content-type=image%2Fgif",
            4.5f,
            listOf("Skateboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "25",
            "Surf Wetsuit - O'Neill Hyperfreak",
            "3/2 mm, men's size large, quick-dry, flexible.",
            190.0,
            "https://www.cleanlinesurf.com/cdn/shop/files/oneill-hyperfreak-fire-4-3-plus-chest-zip-blk-dkred-front_400x@2x.jpg?v=1693447405",
            4.8f,
            listOf("Surfing"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "26",
            "Running Watch - Garmin Forerunner 45",
            "GPS, heart rate monitor, various sport profiles.",
            199.0,
            "https://res.garmin.com/transform/image/upload/b_rgb:FFFFFF,c_pad,dpr_2.0,f_auto,h_400,q_auto,w_400/c_pad,h_400,w_400/v1/Product_Images/en/products/010-02156-06/v/cf-lg-5c74be53-45e1-41c9-9994-a11c90ee4665?pgw=1",
            4.5f,
            listOf("Running"),
            "DannyPhantom654"
        ),
        PlaceholderItem(
            "27",
            "Road Bike - Specialized Allez",
            "54cm frame, ideal for height 5'6\" to 5'9\". Excellent condition.",
            300.0,
            "https://mackcycle.com/cdn/shop/products/specialized-allez-rim-brake-road-bike-flo-red-1.jpg?v=1671897858",
            4.3f,
            listOf("Cycling"),
            "JohnDoe123"
        ),
        PlaceholderItem(
            "28",
            "Mountain Bike - Trek Fuel EX",
            "27.5-inch wheels, medium frame. Suitable for trail and mountain biking.",
            450.0,
            "https://www.sefiles.net/images/library/large/trek-fuel-ex-8-xt-397047-14.jpg",
            4.7f,
            listOf("Cycling"),
            "JaneDoe456"
        ),
        PlaceholderItem(
            "29",
            "Camping Tent - REI Half Dome",
            "4-person capacity, includes rainfly and stakes.",
            120.0,
            "https://www.rei.com/media/52c730d6-56d5-49d3-af8c-6baaf26fa78a.jpg?size=784x588",
            4.9f,
            listOf("Camping", "Hiking"),
            "AliceSmith789"
        ),
        PlaceholderItem(
            "30",
            "Snowboard - Burton Custom",
            "158 cm, all-mountain board. Good for beginners to intermediate riders.",
            200.0,
            "https://www.burton.com/static/product/W23/10688109000_1.png",
            4.5f,
            listOf("Snowboarding"),
            "BobWhite202"
        ),
        PlaceholderItem(
            "31",
            "Kayak - Wilderness Systems Tarpon 100",
            "10 ft, sit-on-top, includes paddle. Great for lakes and rivers.",
            600.0,
            "https://www.peskayak.com/295-large_default/kayak-de-pesca-wilderness-tarpon-100.jpg",
            4.8f,
            listOf("Kayaking"),
            "CharlieBrown321"
        ),
        PlaceholderItem(
            "32",
            "Gymnastics Mats - Tumbling Mat",
            "10ft x 4ft, foldable, ideal for home practice.",
            150.0,
            "https://akathletics.com/cdn/shop/products/4102flat-blue_a871f33e-d8d4-4773-9e05-8a502102c94f.jpg?v=1699032971",
            4.6f,
            listOf("Gymnastics"),
            "DannyPhantom654"
        ),
        PlaceholderItem(
            "33",
            "Electric Skateboard - Boosted Board",
            "22 mph top speed, 14 miles range. Excellent for urban commuting.",
            999.0,
            "https://m.media-amazon.com/images/I/611H4CHUSbL._AC_UF1000,1000_QL80_.jpg",
            4.8f,
            listOf("Skateboarding"),
            "EvaFox777"
        ),
        PlaceholderItem(
            "34",
            "Boxing Ring - Portable Boxing Ring",
            "20ft square, professional grade, easy to assemble.",
            1200.0,
            "https://fujimats.com/cdn/shop/products/24-2_1600x1600.jpg?v=1661370614",
            5.0f,
            listOf("Boxing"),
            "FredAstaire888"
        ),
        PlaceholderItem(
            "35",
            "Fishing Rod - Shimano Deep Sea Rod",
            "10ft, carbon fiber, includes Shimano reel. Perfect for deep-sea fishing.",
            300.0,
            "https://www.evike.com/images/large/jm-100769.jpg",
            4.9f,
            listOf("Fishing"),
            "GraceHopper999"
        ),
        PlaceholderItem(
            "36",
            "Equestrian Saddle - Leather Horse Saddle",
            "Handcrafted leather, comfortable fit for most breeds.",
            750.0,
            "https://www.saddlesworld.com/cdn/shop/products/Sample.jpg?v=1508936631",
            4.7f,
            listOf("Equestrian"),
            "HankZimmer000"
        ),
        PlaceholderItem(
            "37",
            "Running Treadmill - ProForm Pro",
            "Interactive training sessions, 10-inch touch screen, foldable design.",
            800.0,
            "https://m.media-amazon.com/images/I/71OpGFOiHgS._AC_UF1000,1000_QL80_.jpg",
            4.5f,
            listOf("Running"),
            "IvyGreen123"
        ),
        PlaceholderItem(
            "38",
            "Volleyball Net - Portable Net System",
            "Regulation size, easy setup and durable for all weather play.",
            100.0,
            "https://m.media-amazon.com/images/I/711VVdjhNRS._AC_UF1000,1000_QL80_.jpg",
            4.6f,
            listOf("Volleyball"),
            "ZackMars999"
        )
    )

    /**
     * A map of sample (placeholder) items, by ID.
     */
    val ITEM_MAP: Map<String, PlaceholderItem> = ITEMS.associateBy { it.id }

    /**
     * A list of sample (placeholder) items initialized directly.
     */


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
            "27",
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
