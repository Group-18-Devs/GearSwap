plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("androidx.navigation.safeargs.kotlin")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.gearswap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gearswap"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        vectorDrawables.useSupportLibrary = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

//
//// Create a separate Exec task for fetching the google-services.json file
//tasks.register<Exec>("execFetchGoogleServicesJson") {
//    val os = System.getProperty("os.name").toLowerCase()
//    val command = if (os.contains("win")) {
//        "cmd /c doppler secrets get GOOGLE_SERVICES_JSON --plain > " +
//                "..\\app\\google-services.json"
//    } else {
//        "sh -c 'doppler secrets get GOOGLE_SERVICES_JSON --plain > app/google-services.json'"
//    }
//    commandLine = command.split(" ")
//}
//
//// Make the fetchGoogleServicesJson task depend on the Exec task
//tasks.register("fetchGoogleServicesJson") {
//    dependsOn("execFetchGoogleServicesJson")
//
//    doLast {
//        println("Finished fetching google-services.json")
//
//        // Print the contents of the fetched file for debugging
//        val file = file("app/google-services.json")
//        if (file.exists()) {
//            val content = file.readText()
//            println("Content of google-services.json: $content")
//
//            // Check if the content is valid JSON
//            try {
//                com.google.gson.JsonParser.parseString(content)
//                println("google-services.json is valid JSON")
//            } catch (e: com.google.gson.JsonSyntaxException) {
//                println("google-services.json is not valid JSON: ${e.message}")
//                throw e
//            }
//        } else {
//            println("google-services.json file does not exist")
//        }
//    }
//}
//
//tasks.named("preBuild") {
//    dependsOn("fetchGoogleServicesJson")
//}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.recyclerview)
//    implementation("com.github.bumptech.glide:glide:4.12.0")
//    implementation("androidx.recyclerview:recyclerview:1.3.2")
//    implementation("androidx.recyclerview:recyclerview-selection:1.1.0")
    implementation(libs.androidx.cardview)
//    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation(libs.androidx.fragment.ktx)
    implementation(libs.volley)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.androidx.viewpager2.viewpager2)
    implementation(libs.androidx.recyclerview)
    implementation(libs.github.glide)
    implementation(libs.stripe.android)
    implementation(platform("com.google.firebase:firebase-bom:33.1.0"))
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation("com.google.firebase:firebase-analytics")

    // Add the dependencies for any other desired Firebase products
}

