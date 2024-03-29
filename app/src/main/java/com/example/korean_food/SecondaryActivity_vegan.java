package com.example.korean_food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/** Vegan recipe list with photos */
public class SecondaryActivity_vegan extends AppCompatActivity {

    GridView gv_vegan;

    String[] vegan_names = {"Brown Rice",
            "Barley Rice",
            "Pea Rice",
            "Black Bean Rice",
            "Red Bean Rice",
            "Ogokbap",
            "Chestnut Rice",
            "Nutrition Stone Pot Rice",
            "Sweet Potato Rice",
            "Sliced Rice",
            "Bean Sprout Rice",
            "White Porridge",
            "Mung Bean Porridge",
            "Bean Porridge",
            "Red Bean Porridge",
            "Pine Nut Porridge",
            "Jujube Porridge",
            "Grilled Porridge",
            "Zucchini Porridge",
            "Pumpkin Porridge",
            "Janggukjuk",
            "Black Sesame Porridge",
            "Tarak Porridge",
            "Bibim Noodles",
            "Spicy Buckwheat Noodles",
            "Cold Noodles With Cold Buckwheat Noodles",
            "Pine Nut Noodles",
            "Cold Bean Noodles",
            "Dumpling Noodles",
            "Sublime Dumpling",
            "Sujebi",
            "Sea Mustard Soup",
            "Bean Sprout Soup",
            "Spinach Soup",
            "Aukguk",
            "Cold Cucumber Soup",
            "Umu Cold Soup",
            "Soy Bean Paste Stew",
            "Wild Chive Soy Bean Paste Stew",
            "Bean Paste Stew",
            "Cheonggukjang Stew",
            "Soft Tofu Stew",
            "Salted Zucchini Soup Stew",
            "Soybean Soup",
            "Pumpkin Sone",
            "Cucumber",
            "Branched",
            "Tofu Sone",
            "Eggplant Greens",
            "Bracken Greens",
            "Canine Leaf Vegetables",
            "Cold Greens",
            "Balloon Flower",
            "Water Parsley",
            "Radish Greens",
            "Knee Greens",
            "Mewi Greens",
            "Pogo Mushroom Vegetables",
            "Mungbean Sprouts",
            "Spinach Greens",
            "Dried Radish Leaves",
            "Zucchini Greens",
            "Chwinamul",
            "Bean Sprouts",
            "Bamboo Shoots",
            "Salted Salad",
            "Deodeok Saengchae",
            "Spicy Spring Salted Vegetables",
            "Raw Radish Salad",
            "Raw Cucumbers",
            "Chamul Raw Salted Salad",
            "Seasoned Seaweed",
            "Mustard Vegetables",
            "Seasoned Acorns",
            "Seasoned Buckwheat Cake",
            "Braised Potatoes",
            "Braised Lotus Root",
            "Braised Beans",
            "Braised Tofu",
            "Potato Pancake",
            "Sesame Leaf Pancake",
            "Red Pepper Pancake",
            "Zucchini Pancake",
            "Before Lotus Root",
            "Mushroom Pancake",
            "Jangtteok",
            "Raw Dureup",
            "Kim Bu-Gak",
            "Knot Rice Bowl",
            "Pickled Red Pepper",
            "Pickled Sesame Leaves",
            "Pickled Garlic",
            "Pickled Garlic Pickles",
            "Pickled Radish",
            "Cucumber Gourd",
            "Thick Rice Cake",
            "Snow White",
            "Rainbow Rice Cake",
            "Songpyeon",
            "Cinnamon Rice Cake",
            "Yak-Bap",
            "Pumpkin Rice Cake",
            "Patsirutteok",
            "Injeolmi",
            "Pounded Rice Cake",
            "Juak",
            "Chalsujubukkumi",
            "Hwajeon",
            "Gyeongdan",
            "Danja",
            "Yakgwa",
            "Maejakgwa",
            "Gangjeong",
            "Tea Confectionery",
            "Balloon Flower Garden And",
            "Lotus Root Pavilion",
            "Ginger Eggs",
            "Yulan",
            "Bamcho",
            "Jujube Grass",
            "Omija Jelly",
            "Plum Tea",
            "Ginseng Tea",
            "Ginger Tea",
            "Boiled Pear",
            "Persimmon Punch",
            "Sikhye",
            "Omija Fruit Salad",
            "Citron Fruit Salad",
            "Onesobyung",
            "Potato Chili Paste Stew",
            "Chives Pancake",
            "Acorn Pancake",
            "Perilla Soup",
            "Braised Raw Peanuts",
            "Braised Konjac",
            "Steamed Perilla Leaves",
            "Tofu Fried Cake",
            "Stir-Fried Burdock Salad",
            "Stir-Fried Seaweed Stem",
            "Dry Green Algae Dish",
            "Grilled Eggplant Seasoning",
            "Grilled Tofu Seasoning",
            "Leaf Greens",
            "Dried Eggplant Greens",
            "Seasoned With Water Blue",
            "Seasoned With Garlic Bell Pepper Paste",
            "Seasoned With Green Pepper Paste",
            "Pickled Soy Radish",
            "Pickled Mushrooms",
            "Pickled Green Pepper Soy Sauce",
            "Pickled Pollack",
            "Pickled Cucumbers",
            "Pickled Bean Leaves With Soybean Paste",
            "Pickled Kimchi",
            "Pickled Onions",
            "Cucumber Pickles",
            "Cabbage Pickles",
            "Paprika Pickles",
            "Seasoned Cabbage",
            "Green Pepper Kimchi",
            "Cheongpo Mukjeon",
            "Corn Pancake",
            "Green Bean Pancake",
            "Bingtteok",
            "Burdock Perilla Soup",
            "Soybean Paste Soup With Vegetables",
            "Thick Soybean Paste Soup",
            "Seaweed Cucumber Cold Soup",
            "Five Grain Rice",
            "Rice With Seasoned Thistle",
            "Fruit Salad",
            "Lotus Root Salad",
            "Seaweed Vinegar Sashimi",
            "Sweet Rice Pancake",
            "Ginger Dry Fruit",
            "Walnut Crackers",
            "Salted Greens",
            "Soybean Sauce",
            "Stir-Fried Laver",
            "Seasoned With Chubby Balloon Flower",
            "Thermal Movie Beam Surface",
            "Braised Quarigo Chives",
            "Seasoned Cucumbers",
            "Buckwheat Noodles",
            "Braised Nuts",
            "Pickled Deodeok",
            "Braised Kelp",
            "Stir-Fried Eggplant",
            "Green Laver Pancake",
            "Seasoned Green Laver",
            "Sweet Potato Sweet Pumpkin Salad",
            "Windproof Vegetable Seasoning",
            "Chamulmuul Radish",
            "Cold Buckwheat Buckwheat Noodles",
            "Seasoned Coriander",
            "Strong Tofu Red Pepper Paste",
            "Burdock Pickles",
            "Chwinamul Soy Bean Paste Soup",
            "Seasoned Cheongpo Muk",
            "Braised Sweet Pumpkin",
            "Assorted Ssambap",
            "Burdock Japchae",
            "Mushroom Soft Tofu Perilla Soup",
            "Mushroom Mustard Cold Salad",
            "Sesame Leaf Stir-Fry",
            "Stir-Fried Onions",
            "Enoki Mushroom Vegetable Pancake",
            "Lettuce Fresh Kimchi",
            "Seasoned Seaweed With Vinegar",
            "Braised Radish",
            "Broccoli Tofu Salad",
            "Seasoned Wild Vegetables",
            "Seasoned Salad",
            "Seasoned Onion Cucumbers",
            "Stir-Fried Perilla Sprouts",
            "Braised Burdock",
            "Wheat Wrap",
            "Seasoned With Soothing",
            "Stir-Fried Bamboo Shoots",
            "Chwinamul Doenjang Salad",
            "Steamed Sea Squirt Bean Sprouts",
            "Chives Semi Kimchi",
            "Young Radish Greens",
            "Strong Doenjang Yeol Movie Bibimbap",
            "Yeolmu Kimchi Bibim Noodle",
            "Toenmi Soy Bean Paste Soup",
            "Sweet And Sour Mushrooms",
            "Steamed Sweet Pumpkin",
            "Radish Bean Sprout Soup",
            "Yeolmu Bibimbap",
            "Bibimdangmyeon",
            "Sweet Pumpkin Porridge",
            "Sweet Potato Mattang",
            "Seasoned Chives And Cucumbers",
            "Kimjaban",
            "Grilled Tofu Salad",
            "Braised King Oyster Mushroom",
            "Splashing Kelp",
            "A Fish-Shaped Bun",
            "A Plum Crop",
            "Acorn Jelly",
            "Acorn Jelly Salad",
            "Baekseolg",
            "Bamboo Barrel Rice",
            "Bar Rice Cake",
            "Barley Tea",
            "Bean Meat",
            "Bean Paste Cabbage Soup",
            "Bean Rice",
            "Bean Soup",
            "Bean Sprout Hangover Soup",
            "Bean Sprout Konjac Bibimmyeon",
            "Bean Sprout Mushroom Stew",
            "Bean-Soup Noodles",
            "Bibimguks",
            "Bijibap",
            "Black Rice",
            "Black Sesame Skin",
            "Boiled Rice Porridge",
            "Bom-Dong Odejeoljeol",
            "Braised Chestnut",
            "Braised Garlic Almonds",
            "Braised Peanuts",
            "Braised Red Pepper",
            "Braised Soybeans",
            "Buckwheat Rice",
            "Buckwheat Warrior",
            "Bungnamul",
            "Carrot Rice",
            "Carrot Seasoned With Grilled Radish",
            "Cheonggukjang Jjigae",
            "Cheonggukjang",
            "Chinese Cabbage Leaf",
            "Chinese Cabbage Soup",
            "Chodang Tofu",
            "Citron Tea",
            "Cloud Rice Cake",
            "Cold Bean Sprout Salad",
            "Cold Buckwheat Noodles",
            "Cold Soup",
            "Cold Soybean Paste Soup",
            "Corn Rice",
            "Corn Tea",
            "Crispy Rice Crust",
            "Cucumber Pickle",
            "Cucumber Salad",
            "Deep-Fried Sweet Pumpkin",
            "Deodeok Jangaji",
            "Deodeok Kimchi",
            "Doraji Saengchae",
            "Dorajigwa",
            "Dorajimuchim",
            "Dried Persimmon Walnut Wraps",
            "Dried Radish Greens",
            "Dried Radish Salad",
            "Dried Radish",
            "Dried Soybean Paste Seasoned With Dried Radish Leaves",
            "Eggplant Rice",
            "Eggplant Sprouts",
            "Eggplant Tangsu",
            "Fried Eggplant",
            "Fried Onion",
            "Fried Sweet Potatoes",
            "Fried Tofu Sushi",
            "Fried Vegetables",
            "Fried Walnut Garlic",
            "Garlic Pickle",
            "Gijangbap",
            "Ginger Process",
            "Ginseng Process",
            "Glutinous Rice",
            "Gondre Rice",
            "Gondrenamul",
            "Green Pepper Salad",
            "Grilled Deodeok",
            "Grilled Perilla Leaf Tofu",
            "Grilled Rice Cake",
            "Grilled Saesongi Mushroom Soy Sauce",
            "Grilled Saesongi",
            "Grilled Tofu",
            "Gu Gi-Cha",
            "Honey Bread",
            "Honey Butter Sweet Potato",
            "Honey Rice Cake",
            "Jjolmyeon",
            "Joebap",
            "Jujube Tea",
            "Kim Moo-Chim",
            "Kongbiji",
            "Kongtang",
            "Leek Pancake",
            "Lettuce Leaf Salad",
            "Lotus Leaf Rice",
            "Lotus Root Stewing",
            "Mak Noodle",
            "Mixed Grain Rice",
            "Mugwort Rice Cake",
            "Mukbap",
            "Mukguk",
            "Mung Bean Rice",
            "Mushroom Jangjorim",
            "Mushroom Perilla Soup",
            "Nose-Backed Noodles",
            "Nurungjitang",
            "Oat Rice",
            "Oiseon",
            "Oisobak",
            "Omija Hwachae",
            "Onion Pickle",
            "Perilla Leaf Jeon",
            "Perilla Leaf Pickle",
            "Pibab",
            "Pickled Garlic Leaves",
            "Pickled Onion",
            "Potato Ongshimi",
            "Potato Rice",
            "Potato Songpyeon",
            "Powder Made Of Mixed Grains",
            "Puffed Rice",
            "Pumpkin Beombeok",
            "Pumpkin Pancake",
            "Pumpkin Soup",
            "Quince Tea",
            "Radish Ssammari",
            "Ramen Rice",
            "Red Bean Jelly",
            "Red Bean Noodle Soup",
            "Rice Ball",
            "Rice With Enoki Mushroom",
            "Rice With Grilled Pancake",
            "Sanchae Bibimbap",
            "Sancho Pickled Vegetables",
            "Seasoned Bean Sprouts",
            "Seasoned Bracken",
            "Seasoned Cucumber",
            "Seasoned Leek",
            "Seasoned Perilla Leaves",
            "Seasoned Radish",
            "Seasoned Spinach",
            "Seaweed Bibimbap",
            "Seaweed Cold Soup",
            "Shiitake Pancake",
            "Shirutteok",
            "Small Walnut-Flavored Cake",
            "Sorghum Rice",
            "Spicy Cold Noodles",
            "Spinned Bean Paste Soup",
            "Sprout Bibimbap",
            "Ssambap",
            "Ssanghwa-Cha",
            "Steamed Buns",
            "Steamed Soybean Paste Perilla Leaves",
            "Stir-Fried Cucumber",
            "Stir-Fried Garlic Species",
            "Stir-Fried Potatoes",
            "Stir-Fried Udon",
            "Sweet Potato Pancake",
            "Sweet Potato Soup",
            "Sweet Pumpkin Nutrition Rice",
            "Sweet Pumpkin Sikhye",
            "Tadpole Noodles",
            "Tofu And Soybean Paste",
            "Tofu Chagle",
            "Tofu Gangjeong",
            "Tofu Pancake",
            "Tofu Rice",
            "Tofu Spinach Salad",
            "Tray Membrane Noodles",
            "Udon",
            "Vegetable Porridge",
            "Wheat Noodles",
            "White Rice",
            "Yakbap",
            "Yeolmu Kimchi",
            "Yeon Geun Jeon",
            "Young Green Pepper Pancake",
            "Yugwa",
            "Yulmu Bap"


    };
    int[] vegan_images = {
            R.drawable.brown_rice,
            R.drawable.barley_rice,
            R.drawable.pea_rice,
            R.drawable.black_bean_rice,
            R.drawable.red_bean_rice,
            R.drawable.ogokbap,
            R.drawable.chestnut_rice,
            R.drawable.nutrition_stone_pot_rice,
            R.drawable.sweet_potato_rice,
            R.drawable.sliced_rice,
            R.drawable.bean_sprout_rice,
            R.drawable.white_porridge,
            R.drawable.mung_bean_porridge,
            R.drawable.bean_porridge,
            R.drawable.red_bean_porridge,
            R.drawable.pine_nut_porridge,
            R.drawable.jujube_porridge,
            R.drawable.grilled_porridge,
            R.drawable.zucchini_porridge,
            R.drawable.pumpkin_porridge,
            R.drawable.janggukjuk,
            R.drawable.black_sesame_porridge,
            R.drawable.tarak_porridge,
            R.drawable.bibim_noodles,
            R.drawable.spicy_buckwheat_noodles,
            R.drawable.cold_noodles_with_cold_buckwheat_noodles,
            R.drawable.pine_nut_noodles,
            R.drawable.cold_bean_noodles,
            R.drawable.dumpling_noodles,
            R.drawable.sublime_dumpling,
            R.drawable.sujebi,
            R.drawable.sea_mustard_soup,
            R.drawable.bean_sprout_soup,
            R.drawable.spinach_soup,
            R.drawable.aukguk,
            R.drawable.cold_cucumber_soup,
            R.drawable.umu_cold_soup,
            R.drawable.soy_bean_paste_stew,
            R.drawable.wild_chive_soy_bean_paste_stew,
            R.drawable.bean_paste_stew,
            R.drawable.cheonggukjang_stew,
            R.drawable.soft_tofu_stew,
            R.drawable.salted_zucchini_soup_stew,
            R.drawable.pumpkin_sone,
            R.drawable.cucumber,
            R.drawable.branched,
            R.drawable.tofu_sone,
            R.drawable.eggplant_greens,
            R.drawable.bracken_greens,
            R.drawable.canine_leaf_vegetables,
            R.drawable.cold_greens,
            R.drawable.balloon_flower,
            R.drawable.water_parsley,
            R.drawable.radish_greens,
            R.drawable.knee_greens,
            R.drawable.mewi_greens,
            R.drawable.pogo_mushroom_vegetables,
            R.drawable.mungbean_sprouts,
            R.drawable.spinach_greens,
            R.drawable.dried_radish_leaves,
            R.drawable.zucchini_greens,
            R.drawable.chwinamul,
            R.drawable.bean_sprouts,
            R.drawable.bamboo_shoots,
            R.drawable.salted_salad,
            R.drawable.deodeok_saengchae,
            R.drawable.spicy_spring_salted_vegetables,
            R.drawable.raw_radish_salad,
            R.drawable.raw_cucumbers,
            R.drawable.chamul_raw_salted_salad,
            R.drawable.seasoned_seaweed,
            R.drawable.mustard_vegetables,
            R.drawable.seasoned_acorns,
            R.drawable.seasoned_buckwheat_cake,
            R.drawable.braised_potatoes,
            R.drawable.braised_lotus_root,
            R.drawable.braised_beans,
            R.drawable.braised_tofu,
            R.drawable.potato_pancake,
            R.drawable.sesame_leaf_pancake,
            R.drawable.red_pepper_pancake,
            R.drawable.zucchini_pancake,
            R.drawable.before_lotus_root,
            R.drawable.mushroom_pancake,
            R.drawable.jangtteok,
            R.drawable.raw_dureup,
            R.drawable.kim_bu_gak,
            R.drawable.knot_rice_bowl,
            R.drawable.pickled_red_pepper,
            R.drawable.pickled_sesame_leaves,
            R.drawable.pickled_garlic,
            R.drawable.pickled_garlic_pickles,
            R.drawable.pickled_radish,
            R.drawable.cucumber_gourd,
            R.drawable.thick_rice_cake,
            R.drawable.snow_white,
            R.drawable.rainbow_rice_cake,
            R.drawable.songpyeon,
            R.drawable.cinnamon_rice_cake,
            R.drawable.yak_bap,
            R.drawable.pumpkin_rice_cake,
            R.drawable.patsirutteok,
            R.drawable.injeolmi,
            R.drawable.pounded_rice_cake,
            R.drawable.juak,
            R.drawable.chalsujubukkumi,
            R.drawable.hwajeon,
            R.drawable.gyeongdan,
            R.drawable.danja,
            R.drawable.yakgwa,
            R.drawable.maejakgwa,
            R.drawable.gangjeong,
            R.drawable.tea_confectionery,
            R.drawable.balloon_flower_garden_and,
            R.drawable.lotus_root_pavilion,
            R.drawable.ginger_eggs,
            R.drawable.yulan,
            R.drawable.bamcho,
            R.drawable.jujube_grass,
            R.drawable.omija_jelly,
            R.drawable.plum_tea,
            R.drawable.ginseng_tea,
            R.drawable.ginger_tea,
            R.drawable.boiled_pear,
            R.drawable.persimmon_punch,
            R.drawable.sikhye,
            R.drawable.omija_fruit_salad,
            R.drawable.citron_fruit_salad,
            R.drawable.onesobyung,
            R.drawable.potato_chili_paste_stew,
            R.drawable.chives_pancake,
            R.drawable.acorn_pancake,
            R.drawable.perilla_soup,
            R.drawable.braised_raw_peanuts,
            R.drawable.braised_konjac,
            R.drawable.steamed_perilla_leaves,
            R.drawable.tofu_fried_cake,
            R.drawable.stir_fried_burdock_salad,
            R.drawable.stir_fried_seaweed_stem,
            R.drawable.dry_green_algae_dish,
            R.drawable.grilled_eggplant_seasoning,
            R.drawable.grilled_tofu_seasoning,
            R.drawable.leaf_greens,
            R.drawable.dried_eggplant_greens,
            R.drawable.seasoned_with_water_blue,
            R.drawable.seasoned_with_garlic_bell_pepper_paste,
            R.drawable.seasoned_with_green_pepper_paste,
            R.drawable.pickled_soy_radish,
            R.drawable.pickled_mushrooms,
            R.drawable.pickled_green_pepper_soy_sauce,
            R.drawable.pickled_pollack,
            R.drawable.pickled_cucumbers,
            R.drawable.pickled_bean_leaves_with_soybean_paste,
            R.drawable.pickled_onions,
            R.drawable.cucumber_pickles,
            R.drawable.cabbage_pickles,
            R.drawable.paprika_pickles,
            R.drawable.seasoned_cabbage,
            R.drawable.green_pepper_kimchi,
            R.drawable.cheongpo_mukjeon,
            R.drawable.corn_pancake,
            R.drawable.green_bean_pancake,
            R.drawable.bingtteok,
            R.drawable.burdock_perilla_soup,
            R.drawable.soybean_paste_soup_with_vegetables,
            R.drawable.thick_soybean_paste_soup,
            R.drawable.seaweed_cucumber_cold_soup,
            R.drawable.five_grain_rice,
            R.drawable.rice_with_seasoned_thistle,
            R.drawable.fruit_salad,
            R.drawable.lotus_root_salad,
            R.drawable.seaweed_vinegar_sashimi,
            R.drawable.sweet_rice_pancake,
            R.drawable.ginger_dry_fruit,
            R.drawable.walnut_crackers,
            R.drawable.salted_greens,
            R.drawable.soybean_sauce,
            R.drawable.stir_fried_laver,
            R.drawable.seasoned_with_chubby_balloon_flower,
            R.drawable.thermal_movie_beam_surface,
            R.drawable.braised_quarigo_chives,
            R.drawable.seasoned_cucumbers,
            R.drawable.buckwheat_noodles,
            R.drawable.braised_nuts,
            R.drawable.pickled_deodeok,
            R.drawable.braised_kelp,
            R.drawable.stir_fried_eggplant,
            R.drawable.green_laver_pancake,
            R.drawable.seasoned_green_laver,
            R.drawable.sweet_potato_sweet_pumpkin_salad,
            R.drawable.windproof_vegetable_seasoning,
            R.drawable.chamulmuul_radish,
            R.drawable.cold_buckwheat_buckwheat_noodles,
            R.drawable.seasoned_coriander,
            R.drawable.strong_tofu_red_pepper_paste,
            R.drawable.burdock_pickles,
            R.drawable.chwinamul_soy_bean_paste_soup,
            R.drawable.seasoned_cheongpo_muk,
            R.drawable.braised_sweet_pumpkin,
            R.drawable.assorted_ssambap,
            R.drawable.burdock_japchae,
            R.drawable.mushroom_soft_tofu_perilla_soup,
            R.drawable.mushroom_mustard_cold_salad,
            R.drawable.sesame_leaf_stir_fry,
            R.drawable.stir_fried_onions,
            R.drawable.enoki_mushroom_vegetable_pancake,
            R.drawable.lettuce_fresh_kimchi,
            R.drawable.seasoned_seaweed_with_vinegar,
            R.drawable.braised_radish,
            R.drawable.broccoli_tofu_salad,
            R.drawable.seasoned_wild_vegetables,
            R.drawable.seasoned_salad,
            R.drawable.seasoned_onion_cucumbers,
            R.drawable.stir_fried_perilla_sprouts,
            R.drawable.braised_burdock,
            R.drawable.wheat_wrap,
            R.drawable.seasoned_with_soothing,
            R.drawable.stir_fried_bamboo_shoots,
            R.drawable.chwinamul_doenjang_salad,
            R.drawable.steamed_sea_squirt_bean_sprouts,
            R.drawable.young_radish_greens,
            R.drawable.strong_doenjang_yeol_movie_bibimbap,
            R.drawable.yeolmu_kimchi_bibim_noodle,
            R.drawable.toenmi_soy_bean_paste_soup,
            R.drawable.sweet_and_sour_mushrooms,
            R.drawable.steamed_sweet_pumpkin,
            R.drawable.radish_bean_sprout_soup,
            R.drawable.yeolmu_bibimbap,
            R.drawable.bibimdangmyeon,
            R.drawable.sweet_pumpkin_porridge,
            R.drawable.sweet_potato_mattang,
            R.drawable.seasoned_chives_and_cucumbers,
            R.drawable.kimjaban,
            R.drawable.grilled_tofu_salad,
            R.drawable.braised_king_oyster_mushroom,
            R.drawable.splashing_kelp,
            R.drawable.a_fish_shaped_bun,
            R.drawable.a_plum_crop,
            R.drawable.bamboo_barrel_rice,
            R.drawable.bar_rice_cake,
            R.drawable.barley_tea,
            R.drawable.bean_meat,
            R.drawable.bean_sprout_hangover_soup,
            R.drawable.bean_sprout_konjac_bibimmyeon,
            R.drawable.bean_sprout_mushroom_stew,
            R.drawable.bean_soup_noodles,
            R.drawable.black_sesame_skin,
            R.drawable.boiled_rice_porridge,
            R.drawable.bom_dong_odejeoljeol,
            R.drawable.braised_chestnut,
            R.drawable.braised_garlic_almonds,
            R.drawable.braised_peanuts,
            R.drawable.braised_soybeans,
            R.drawable.buckwheat_warrior,
            R.drawable.bungnamul,
            R.drawable.carrot_seasoned_with_grilled_radish,
            R.drawable.cheonggukjang_jjigae,
            R.drawable.cheonggukjang,
            R.drawable.chinese_cabbage_leaf,
            R.drawable.chodang_tofu,
            R.drawable.citron_tea,
            R.drawable.cloud_rice_cake,
            R.drawable.cold_bean_sprout_salad,
            R.drawable.cold_buckwheat_noodles,
            R.drawable.cold_soybean_paste_soup,
            R.drawable.crispy_rice_crust,
            R.drawable.cucumber_pickle,
            R.drawable.cucumber_salad,
            R.drawable.deep_fried_sweet_pumpkin,
            R.drawable.deodeok_jangaji,
            R.drawable.doraji_saengchae,
            R.drawable.dorajigwa,
            R.drawable.dorajimuchim,
            R.drawable.dried_radish_salad,
            R.drawable.dried_soybean_paste_seasoned_with_dried_radish_leaves,
            R.drawable.eggplant_tangsu,
            R.drawable.fried_eggplant,
            R.drawable.fried_onion,
            R.drawable.fried_sweet_potatoes,
            R.drawable.fried_tofu_sushi,
            R.drawable.fried_vegetables,
            R.drawable.fried_walnut_garlic,
            R.drawable.garlic_pickle,
            R.drawable.ginger_process,
            R.drawable.ginseng_process,
            R.drawable.gondre_rice,
            R.drawable.green_pepper_salad,
            R.drawable.grilled_deodeok,
            R.drawable.grilled_perilla_leaf_tofu,
            R.drawable.grilled_rice_cake,
            R.drawable.grilled_saesongi_mushroom_soy_sauce,
            R.drawable.grilled_tofu,
            R.drawable.gu_gi_cha,
            R.drawable.honey_bread,
            R.drawable.honey_butter_sweet_potato,
            R.drawable.honey_rice_cake,
            R.drawable.jjolmyeon,
            R.drawable.jujube_tea,
            R.drawable.kim_moo_chim,
            R.drawable.kongbiji,
            R.drawable.kongtang,
            R.drawable.leek_pancake,
            R.drawable.lettuce_leaf_salad,
            R.drawable.lotus_leaf_rice,
            R.drawable.mak_noodle,
            R.drawable.mixed_grain_rice,
            R.drawable.mugwort_rice_cake,
            R.drawable.mukbap,
            R.drawable.mushroom_perilla_soup,
            R.drawable.nose_backed_noodles,
            R.drawable.oiseon,
            R.drawable.oisobak,
            R.drawable.omija_hwachae,
            R.drawable.onion_pickle,
            R.drawable.perilla_leaf_jeon,
            R.drawable.perilla_leaf_pickle,
            R.drawable.pickled_onion,
            R.drawable.potato_ongshimi,
            R.drawable.potato_songpyeon,
            R.drawable.powder_made_of_mixed_grains,
            R.drawable.puffed_rice,
            R.drawable.pumpkin_beombeok,
            R.drawable.quince_tea,
            R.drawable.radish_ssammari,
            R.drawable.red_bean_jelly,
            R.drawable.red_bean_noodle_soup,
            R.drawable.rice_ball,
            R.drawable.rice_with_enoki_mushroom,
            R.drawable.rice_with_grilled_pancake,
            R.drawable.sanchae_bibimbap,
            R.drawable.sancho_pickled_vegetables,
            R.drawable.seasoned_bean_sprouts,
            R.drawable.seasoned_bracken,
            R.drawable.seasoned_cucumber,
            R.drawable.seasoned_radish,
            R.drawable.seasoned_spinach,
            R.drawable.seaweed_bibimbap,
            R.drawable.seaweed_cold_soup,
            R.drawable.shirutteok,
            R.drawable.small_walnut_flavored_cake,
            R.drawable.spicy_cold_noodles,
            R.drawable.spinned_bean_paste_soup,
            R.drawable.sprout_bibimbap,
            R.drawable.ssambap,
            R.drawable.ssanghwa_cha,
            R.drawable.steamed_buns,
            R.drawable.steamed_soybean_paste_perilla_leaves,
            R.drawable.stir_fried_cucumber,
            R.drawable.stir_fried_udon,
            R.drawable.sweet_potato_pancake,
            R.drawable.sweet_potato_soup,
            R.drawable.sweet_pumpkin_nutrition_rice,
            R.drawable.tofu_and_soybean_paste,
            R.drawable.tofu_chagle,
            R.drawable.tofu_gangjeong,
            R.drawable.tofu_pancake,
            R.drawable.tofu_spinach_salad,
            R.drawable.tray_membrane_noodles,
            R.drawable.udon,
            R.drawable.vegetable_porridge,
            R.drawable.wheat_noodles,
            R.drawable.yeolmu_kimchi,
            R.drawable.yeon_geun_jeon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary_vegan);

        gv_vegan = findViewById(R.id.gv_vegan);

        CustomAdapter customAdapter = new CustomAdapter(vegan_names, vegan_images,this);

        gv_vegan.setAdapter(customAdapter);

        gv_vegan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedName = vegan_names[i];
                int selectedImage = vegan_images[i];

                startActivity(new Intent(SecondaryActivity_vegan.this, Fooddescription.class).putExtra("name",selectedName).putExtra("image",selectedImage));
            }
        });

    }

    /** Gateway from list of recipes to Fooddescription */
    public class CustomAdapter extends BaseAdapter{
        private String[] imageNames;
        private int[] imagePhotos;
        private Context context;
        private LayoutInflater layoutInflater;

        public CustomAdapter(String[] imageNames, int[] imagePhotos, Context context) {
            this.imageNames = imageNames;
            this.imagePhotos = imagePhotos;
            this.context = context;
            this.layoutInflater = (LayoutInflater) context.getSystemService(LAYOUT_INFLATER_SERVICE);

        }

        @Override
        public int getCount() {
            return imagePhotos.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view == null) {
                view = layoutInflater.inflate(R.layout.gv_vegan_rowitems, viewGroup, false);
            }

            TextView tv_vegan = view.findViewById(R.id.tv_vegan);
            ImageView iv_vegan = view.findViewById(R.id.iv_vegan);

            tv_vegan.setText(imageNames[i]);
            iv_vegan.setImageResource(imagePhotos[i]);

            return view;
        }
    }
}