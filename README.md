# Milestone 1 - GearSwap (Unit 7)

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview

### Description

GearSwap is a user-friendly, community-driven platform for renting and sharing sports equipment, which reduces the cost burden of trying new sports and facilitates an active lifestyle.

- **Category**: Sharing Economy, Sports

- **Mobile**: Uses location services for nearby equipment, push notifications for availability updates, and camera functionality for posting gear pictures.

  - **Location Services**: Uses GPS to show available equipment nearby, enhancing the convenience of finding and renting sports gear directly from the app.
  - A car owner balancing daily transportation needs with a busy schedule seeks a quick way to find nearby mechanics for both routine maintenance
  - **Push Notifications**: Sends updates about equipment availability, rental confirmations, and reminders for equipment returns.
  - **Camera Integration**: Allows users to upload photos of their equipment, which can help in listing and verifying the condition of the items.
  - **Chat/Messaging Feature**: Facilitates real-time communication among users, enabling discussions, collaboration, and the exchange of information within the community.
</br></br>
 - **Story**: GearSwap provides a community-driven platform for athletes to access a variety of sports equipment without the need to purchase them outright. making it compelling for cost-conscious users or those trying new sports.
      - **Organizer for a Beach Volleyball Event**: Organizer is organizing a beach volleyball event but the org/group does not have enough nets. Organizer rents volleyball nets and balls through GearSwap from local sports enthusiasts who list their equipment when not in use. The event is a success with all necessary equipment, and Organizer saves on costs while ensuring a fun day for participants.
      - **Weekend Cyclist**: Cyclist wants to explore mountain biking but only has a road bike. He uses GearSwap to rent a mountain bike posted by someone in his city. Cyclist enjoys a weekend of mountain biking and gains enough experience to make an informed decision about buying his own mountain bike.
      - **Family Vacation/Getaway**. A family wants to try kayaking during their lake house vacation but doesn't want to invest in buying kayaks just yet. They search GearSwap and find a nearby listing where they can rent kayaks for the week. The family enjoys their kayaking experience and considers renting again for future trips or possibly buying their own kayaks.
      - **Beginner Athletes**: A user new to a sport like tennis could use the chatbot to find out what kind of racquet is best for beginners, the appropriate size for their height, and tips on basic strokes.
      - **Seasoned Sports Enthusiasts**: A seasoned skier planning to try snowboarding might use GearSwap to rent snowboarding gear for a season before deciding whether to invest in their own. They benefit from user reviews to choose the best equipment.
      - **Families**: A family interested in camping but without the necessary gear can use GearSwap to rent equipment for their weekend getaway. They interact with the chatbot to ensure they get all the necessary items and proper sizes for all family members.
      - **Event Organizers**: Local sports event organizers use GearSwap to provide attendees with the necessary equipment, ensuring participants have access to everything they need without having to buy new gear.
  </br></br>  
- **Scope**: The technical scope includes user registration, equipment listing, search and filtering capabilities, transaction processing, and reputation management. Starting with basic rental features and gradually integrating AI-driven recommendations and a robust chatbot can make GearSwap a go-to app in the sports community. A minimal MVP with basic listing and renting functionality would still be appealing and feasible within a limited timeframe.
  - **User Interface**: Designing an interface that allows for easy uploading, browsing, and renting of sports equipment. It needs to be intuitive enough for all age groups and tech-savvy levels.
  - **Backend System**: A robust backend system is essential for managing the large volumes of data and interactions on the app. This system should handle user management, equipment listings, transactions, and communications efficiently. It would also support the chatbot, recommendation engine, and dynamic pricing model by processing real-time data and user inputs securely.
  - **Security and Payments**: Ensuring secure transactions and protecting user data, especially for payments and personal information shared during rentals.
  - **AI-Powered Chatbot**: A chatbot equipped to assist users in determining the type of equipment they need based on the sport, their skill level, and other preferences. It can also provide guidance on sizing, basic usage instructions, and maintenance tips.
  - **Recommendation Engine**: Utilizes user data and preferences to suggest equipment that matches their needs and previous activities. This can help new users find equipment that suits their level of expertise or interests.
  - **Dynamic Pricing Model**: AI algorithms can analyze demand and supply data to suggest optimal rental prices for listed equipment, benefiting both lenders and borrowers.
  - **User Reviews and Ratings**: After using the equipment, renters can rate and review both the gear and the lender. This feature helps build trust and ensures high-quality listings.
  - **Community Forums**: A section where users can discuss different sports, share experiences, and give advice on equipment use, which strengthens the community aspect of the app.
  - **Skill-Based Workshops and Events**: The app can promote or organize local sports events and workshops, encouraging users to try new sports or improve their skills, thus increasing the app’s usage.

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**

1. **User Registration and Login**: Allow users to register and log in using their email.
2. **Post Listings**: Users can post listings of their sports equipment including descriptions, photos, and rental terms.
3. **Search and Filter Listings**: Users can search for available equipment nearby based on different filters like sport type, location, and price.
4. **Booking System**: Users can book equipment directly through the app.
5. **User Profiles**: Basic user profiles that display posted listings and past rentals.

**Optional Features**

1. **Rating and Review System**: After a rental period ends, users can rate and review the equipment and the lender.
2. **In-App Messaging**: Allows users to communicate within the app without sharing personal contact details.
3. **Advanced Filters**: Additional filters for search, such as availability dates or specific brand names.
4. **Push Notifications**: Notifications for booking confirmations, upcoming rental periods, and new messages.
5. **AI-Powered Chatbot**: A chatbot that assists users in finding the right equipment based on their needs and answers questions about equipment use and maintenance.
6. **Community Forums**: A section within the app where users can discuss different sports, share experiences, and give advice on equipment use, fostering a sense of community.

### 2. Screen Archetypes

- **Login / Register Screen**
  - Allows users to create a new account or log in to an existing one using email and password. Could also include options for social media or Google logins for added convenience. Include an option to just browse
- **Home Screen**
  - Displays a dynamic list of available equipment, with options to sort by proximity, popularity, or recent additions. This screen also features a search bar for direct queries and access to advanced filters.
- **Listing Detail Screen**
  - Provides comprehensive information about a piece of equipment, including high-quality images, detailed descriptions, user reviews, and rental terms. Includes a “Book Now” button to start the rental process.
- **Post Listing Screen**
  - Allows users to create a new listing. Fields include equipment name, description, category (e.g., bikes, skis, camping gear), rental price per day, and photo uploads. Options to set availability dates and special conditions or instructions.
- **Profile Screen**
  - Shows the user’s public profile, including their name, profile picture, bio, a list of their favorited/wishlist items and a summary of their activity (posted listings and past rentals). Options for users to edit their personal information and manage their account settings.

#### Additional Screens: Booking, Chats, etc.

- **Booking: Date Selection**
  - Allows users to select the start and end dates for the rental using a calendar interface. The system checks the availability of the item for the selected dates and displays pricing per day along with the total cost for the chosen period.
- **Booking: Final Review**
  - Provides a summary of the booking details before final confirmation. Users can review the total cost, rental dates, and terms. They may also add a special request or note for the equipment owner here.
- **Booking: Confirmation**
  - Displays a booking confirmation message with a summary of the order, rental period, and pickup instructions. Includes an option to add the booking details to the user's calendar and to contact the owner directly.
- **Search Results Screen**
  - Shows the results based on the user’s search queries or selected filters. Items are listed with thumbnail images, brief descriptions, and the option to navigate to their detailed pages.
- **Ratings and Reviews Screen**
  - Post-rental, users are prompted to rate their experience and write a review of the equipment and the lender. This screen will guide them through submitting their feedback to help maintain the quality and trustworthiness of the community.
- **Chat Screen**
  - Integrated within the app to facilitate secure and private messaging between the equipment owner and the renter. Useful for discussing pickup details, asking additional questions about the equipment, or coordinating returns.

### 3. Navigation

**Tab Navigation** (Tab to Screen)

- **Home**: Directs to the Home Screen where users can browse listings.
- **Post Listing**: Opens the screen to create a new equipment listing.
- **Profile**: Navigates to the user's profile and settings.

**Flow Navigation** (Screen to Screen)

- **Login / Register Screen**
  - -> Home</br>(Can skip Login should re-prompt at profile/transactions)
- **Home Screen**
  - Listing item -> Listing Detail Screen.
- **Listing Detail Screen**
  - Button to start the booking process.
    (Add Booking flow)
  - Back -> Home Screen.
- **Post Listing Screen**
  - Submit -> Home
    (highlight new listing)
- **Profile Screen**
  - Option to edit profile details or view own listings and rentals.

## Wireframes
![Figma WireFrame](https://github.com/Group-18-Devs/GearSwap/assets/106501057/8689031f-0d57-43ac-beb4-dfc8dedc5355)

<br>

<br>

### [BONUS] Digital Wireframes & Mockups
![Figma WireFrame](https://github.com/Group-18-Devs/GearSwap/assets/106501057/9048f41c-3e12-45ca-a673-b4556d22a293)



### [BONUS] Interactive Prototype

<br>
