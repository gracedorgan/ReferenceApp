package com.gmd.referenceapplication;

import android.content.Context;
import android.text.Html;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by gmd on 6/13/2016.
 */

public class MyDataProvider {

    Context context;
    String test;
    ListViewItem constant_common_data[];


    //constructor for class MyDataProvider
    public MyDataProvider(Context context1){
        context=context1;

        init_constant_common_data();
        putInCommonMap();
        putInElectromagneticMap();
        putInNucMap();
        putInChemMap();
        putInAllMap();

    }
    //strings for sub and superscript


    //data for common constants
    public void init_constant_common_data(){
    constant_common_data = new ListViewItem[]
            {
                    new ListViewItem(R.drawable.star, "Atomic Mass Constant ", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 020 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Avogadro Constant", Html.fromHtml("6.022 140 857 x 10<sup><small>23</small></sup>"),Html.fromHtml(" mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 074 x 10<sup><small>23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann Constant", Html.fromHtml("1.380 648 52 x 10<sup><small>-23</small></sup>"), Html.fromHtml("K<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 79 x 10<sup><small>-23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Conductance Quantum", Html.fromHtml("7.748 091 7310 x 10<sup><small>-5</small></sup>"), Html.fromHtml("s"),Html.fromHtml("0.000 000 0018 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electric Constant", Html.fromHtml("8.854 187 817... x 10<sup><small>-12</small></sup>"), Html.fromHtml("F m<sup><small>-1</small></sup>"), Html.fromHtml("(exact)")),

                    new ListViewItem(R.drawable.star, "Electron mass", Html.fromHtml("9.109 383 56 x 10<sup><small>-31</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 11 x 10<sup><small>-31</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron volt", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml(" J"), Html.fromHtml("0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"), Html.fromHtml("C"), Html.fromHtml("0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Faraday constant ", Html.fromHtml("96 485.332 89 x 10<sup><small>-5</small></sup>"), Html.fromHtml("C <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 59")),
                    new ListViewItem(R.drawable.star, "Fine-structure constant ", Html.fromHtml("7.297 352 5664 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)  "), Html.fromHtml("0.000 000 0017 x 10<sup><small>-3</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Inverse fine-structure constant", Html.fromHtml("137.035 999 139"),Html.fromHtml( "  "),Html.fromHtml( "0.000 000 031")),
                    new ListViewItem(R.drawable.star, "Magnetic constant", Html.fromHtml("4pi e-7 = 12.566 370 614... x 10<sup><small>-7</small></sup>"),Html.fromHtml(" N <sup><small>.</small></sup> A<sup><small>-2</small></sup>"),Html.fromHtml( "(exact)")),
                    new ListViewItem(R.drawable.star, "Magnetic Flux Quantum", Html.fromHtml("2.067 833 831 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "Wb"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Gas constant", Html.fromHtml("8.314 4598"),Html.fromHtml( "J mol<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0048")),
                    new ListViewItem(R.drawable.star, "Newtonian constant of gravitation ", Html.fromHtml("6.674 08 x 10<sup><small>-11</small></sup>"),Html.fromHtml( "m<sup><small>3</small></sup> <sup><small>.</small></sup> kg<sup><small>-1</small></sup> <sup><small>.</small></sup> s<sup><small>-2</small></sup>"),Html.fromHtml( "0.000 31 x 10<sup><small>-11</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Planck constant", Html.fromHtml("6.626 070 040x 10<sup><small>-34</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> s"), Html.fromHtml("0.000 000 081 x 10<sup><small>-34</small></sup>")),
                    new ListViewItem(R.drawable.star, "Planck constant over 2 pi", Html.fromHtml("1.054 571 800x 10<sup><small>-34</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> s"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-34</small></sup>")),
                    new ListViewItem(R.drawable.star, "Proton Mass", Html.fromHtml("1.672 621 898 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 021 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Proton-Electron Mass Ratio", Html.fromHtml("1836.152 673 89"), Html.fromHtml("(none) "), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Rydberg constant", Html.fromHtml("10 973 731.568 508"), Html.fromHtml("m<sup><small>-1</small></sup>"), Html.fromHtml("0.000 065")),
//
                    new ListViewItem(R.drawable.star, "Speed of Light in Vacuum", Html.fromHtml("299 792 458"), Html.fromHtml("m <sup><small>.</small></sup> s<sup><small>-1</small></sup>"), Html.fromHtml("(exact)")),
                    new ListViewItem(R.drawable.star, "Stefan-Boltzmann constant", Html.fromHtml("5.670 367 x 10<sup><small>-8</small></sup>"), Html.fromHtml("Wm<sup><small>-2</small></sup> <sup><small>.</small></sup> K<sup><small>-4</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-8</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Bohr Radius", Html.fromHtml("0.529 177 210 67 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 000 000 12 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr Magneton ", Html.fromHtml("927.400 9994 x 10<sup><small>-26</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0057 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Josephson constant", Html.fromHtml("483 597.8525 x 10<sup><small>9</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> V<sup><small>-1</small></sup>"),Html.fromHtml( "0.0030 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Von Klitzing constant", Html.fromHtml("25 812.807 4555"), Html.fromHtml("Ohm"),Html.fromHtml( "0.000 0059")),
                    new ListViewItem(R.drawable.star, "Unified Atomic Mass Unit", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 020 x 10<sup><small>-27</small></sup>"))
            };}
    HashMap<String,ListViewItem> commonMap = new HashMap<String, ListViewItem>();

//data entry for electromagnetic constants
    ListViewItem constant_electromagnetic_data[] = new ListViewItem[]
            {

                    new ListViewItem(R.drawable.star, "Bohr Magneton ", Html.fromHtml("927.400 9994 x 10<sup><small>-26</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0057 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in (eV)/T", Html.fromHtml("5.788 381 8012 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "<sup>(eV)</sip>/<sub>T</sub>"),Html.fromHtml( "0.000 000 0026 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in Hz/T", Html.fromHtml("13.996 245 042 x 10<sup><small>9</small></sup>"),Html.fromHtml(" Hz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 086 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in inverse meters per tesla", Html.fromHtml("46.686 448 14"), Html.fromHtml("m<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 29")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in K/T", Html.fromHtml("0.671 714 05"),Html.fromHtml( "K <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 39")),
                    new ListViewItem(R.drawable.star, "Conductance Quantum", Html.fromHtml("7.748 091 7310 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "s"),Html.fromHtml("0.000 000 0018 x 10<sup><small>-5</small></sup>")),

                    new ListViewItem(R.drawable.star, "Elementary Charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"), Html.fromHtml("C"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron Volt", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml(" J"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary Charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml( "C"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary Charge over h", Html.fromHtml("2.417 989 262 x 10<sup><small>14</small></sup>"),Html.fromHtml( "A <sup><small>.</small></sup> J<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>14</small></sup>")),
                    new ListViewItem(R.drawable.star, "Inverse of Conductance quantum", Html.fromHtml("12 906.403 7278"),Html.fromHtml( "Ohms"),Html.fromHtml( "0.000 0029")),
//
                    new ListViewItem(R.drawable.star, "Josephson constant", Html.fromHtml("483 597.8525 x 10<sup><small>9</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> V<sup><small>-1</small></sup>"),Html.fromHtml( "0.0030 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Magnetic Flux Quantum", Html.fromHtml("2.067 833 831 x 10<sup><small>-15</small></sup>"), Html.fromHtml("Wb"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton",Html.fromHtml( "5.050 783 699 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 031 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in (eV)/T ", Html.fromHtml("3.152 451 2550 x 10<sup><small>-8</small></sup>"),Html.fromHtml( "<sup>(eV)</sip>/<sub>T</sub>"),Html.fromHtml( "0.000 000 0015 x 10<sup><small>-8</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in inverse meters per tesla", Html.fromHtml("2.542 623 432 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "m<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 016 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in K/T", Html.fromHtml("3.658 2690 x 10<sup><small>-4</small></sup>"),Html.fromHtml("K <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0021")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in MHz/T ", Html.fromHtml("7.622 593 285"), Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 047")),
                    new ListViewItem(R.drawable.star, "Von Klitzing constant", Html.fromHtml("25 812.807 4555"),Html.fromHtml( "Ohm"),Html.fromHtml( "0.000 0059"))
            };

    HashMap<String,ListViewItem> electromagneticMap = new HashMap<String, ListViewItem>();


    //data entry for Atomic and nuclear constants :(
    ListViewItem constant_atomic_data[] = new ListViewItem[]
            {

                    new ListViewItem(R.drawable.star, "Alpha Particle Mass", Html.fromHtml("6.644 657 230 x 10<sup><small>-27</small></sup>"),Html.fromHtml(" kg"),Html.fromHtml( "0.000 000 082 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass energy equivalent", Html.fromHtml("5.971 920 097 x 10<sup><small>-10</small></sup>"), Html.fromHtml("J"), Html.fromHtml("0.000 000 073 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass energy equivalent in MeV ", Html.fromHtml("3727.379 378"),Html.fromHtml(" MeV"), Html.fromHtml("0.000 023")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass in u", Html.fromHtml("4.001 506 179 127"), Html.fromHtml("u"), Html.fromHtml("0.000 000 000 063")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Molar mass", Html.fromHtml("4.001 506 179 127 x 10<sup><small>-3</small></sup>"), Html.fromHtml("mol<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 000 063 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle-Electron mass ratio", Html.fromHtml("7294.299 541 36"), Html.fromHtml("(none)"),Html.fromHtml("0.000 000 24")),
//
                    new ListViewItem(R.drawable.star, "Alpha Particle-Proton mass ratio ", Html.fromHtml("3.972 599 689 07"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 36")),
                    new ListViewItem(R.drawable.star, "Bohr Radius", Html.fromHtml("0.529 177 210 67 x 10<sup><small>-10</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 000 12 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Classical Electron Radius", Html.fromHtml("2.817 940 3227 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.000 000 0019 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Compton Wavelength", Html.fromHtml("2.426 310 2367 x 10<sup><small>-12</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 0011 x 10<sup><small>-12</small></sup>")),

                    new ListViewItem(R.drawable.star, "Compton Wavelength over 2 pi", Html.fromHtml("386.159 267 64 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 18 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron g factor ", Html.fromHtml("0.857 438 2311"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0048")),

                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment ", Html.fromHtml("0.433 073 5040 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 0036 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment to Bohr magneton ratio ", Html.fromHtml("0.466 975 4554 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0026 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment to nuclear magneton ratio", Html.fromHtml("0.857 438 2311"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0048")),
                    new ListViewItem(R.drawable.star, "Deuteron mass ", Html.fromHtml("3.343 583 719 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 041 x 10<sup><small>-27</small></sup>")),

                    new ListViewItem(R.drawable.star, "Deuteron mass energy equivalent ", Html.fromHtml("3.005 063 183 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 037 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron mass energy equivalent in MeV", Html.fromHtml(" 1875.612 928"),Html.fromHtml("MeV"), Html.fromHtml("0.000 012")),
                    new ListViewItem(R.drawable.star, "Deuteron mass in u", Html.fromHtml("2.013 553 212 745"),Html.fromHtml( "u"), Html.fromHtml("0.000 000 000 040")),
                    new ListViewItem(R.drawable.star, "Deuteron molar mass", Html.fromHtml("2.013 553 212 745 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 040 x 10<sup><small>-3</small></sup>")),


                    new ListViewItem(R.drawable.star, "Deuteron rms charge radius", Html.fromHtml("2.1413 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.0025 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron-Electron magnetic moment ratio", Html.fromHtml("-4.664 345 535 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 026 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron-Electron mass ratio", Html.fromHtml("3670.482 967 85"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 13")),
                    new ListViewItem(R.drawable.star, "Deuteron-Neutron magnetic moment ratio", Html.fromHtml("-0.448 206 52"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 11")),
                    new ListViewItem(R.drawable.star, "Deuteron-Proton magnetic moment ratio", Html.fromHtml("0.307 012 2077"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 0015")),
                    new ListViewItem(R.drawable.star, "Deuteron-Proton mass ratio", Html.fromHtml("1.999 007 500 87"), Html.fromHtml("(none)"),Html.fromHtml("0.000 000 000 19")),

                    new ListViewItem(R.drawable.star, "Electron charge to mass quotient", Html.fromHtml("-1.758 820 024 x 10<sup><small>11</small></sup>"), Html.fromHtml("C <sup><small>.</small></sup> kg<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 011 x 10<sup><small>11</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron g factor ", Html.fromHtml("-2.002 319 304 361 82"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 000 52")),
                    new ListViewItem(R.drawable.star, "Electron gyromagnetic ratio", Html.fromHtml("1.760 859 644 x 10<sup><small>11</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 011 x 10<sup><small>11</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron gyromagnetic ratio over 2 pi ", Html.fromHtml("28 024.951 64 "),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 17")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment ", Html.fromHtml("-928.476 4620 x 10<sup><small>-26</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 0057 x 10<sup><small>-26</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron magnetic moment anomaly", Html.fromHtml("1.159 652 180 91 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 000 26  x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.001 159 652 180 91"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 000 26")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment to nuclear magneton ratio", Html.fromHtml("-1838.281 972 34"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Electron mass", Html.fromHtml("9.109 383 56 x 10<sup><small>-31</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 11 x 10<sup><small>-31</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron mass energy equivalent", Html.fromHtml("8.187 105 65 x 10<sup><small>-14</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 10 x 10<sup><small>-14</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron mass energy equivalent in MeV", Html.fromHtml("0.510 998 9461"),Html.fromHtml( "MeV"), Html.fromHtml("0.000 000 0031")),
                    new ListViewItem(R.drawable.star, "Electron mass in u ", Html.fromHtml("5.485 799 090 70 x 10<sup><small>-4</small></sup>"),Html.fromHtml("u"), Html.fromHtml("0.000 000 000 16 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron Molar mass", Html.fromHtml("5.485 799 090 70 x 10<sup><small>-7</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 000 16 x 10<sup><small>-7</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron to Alpha Particle mass ratio", Html.fromHtml("1.370 933 554 798 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 000 045 x 10<sup><small>-4</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron to Shielded Helion magnetic moment ratio", Html.fromHtml("864.058 257"), Html.fromHtml("(none)"), Html.fromHtml("0.000 010")),
                    new ListViewItem(R.drawable.star, "Electron to Shielded Proton magnetic moment ratio", Html.fromHtml("-658.227 5971"),Html.fromHtml("(none)"), Html.fromHtml("0.000 0072")),
                    new ListViewItem(R.drawable.star, "Electron-deuteron magnetic moment ratio", Html.fromHtml("-2143.923 499"), Html.fromHtml("(none)"), Html.fromHtml("0.000 012")),
                    new ListViewItem(R.drawable.star, "Electron-deuteron mass ratio", Html.fromHtml("2.724 437 107 484 x 10<sup><small>-4</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 000 096 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-helion mass ratio ", Html.fromHtml("1.819 543 074 854 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 088 x 10<sup><small>-4</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron-Muon magnetic moment ratio ", Html.fromHtml("206.766 9880"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0046")),
                    new ListViewItem(R.drawable.star, "Electron-Muon mass ratio", Html.fromHtml("4.836 331 70 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 11 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Neutron magnetic moment ratio", Html.fromHtml("960.920 50"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 23")),
                    new ListViewItem(R.drawable.star, "Electron-Neutron mass ratio", Html.fromHtml("5.438 673 4428 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0027 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Proton magnetic moment ratio", Html.fromHtml("-658.210 6866"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0020")),

//
                    new ListViewItem(R.drawable.star, "Electron-Proton mass ratio", Html.fromHtml("5.446 170 213 52 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 52 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Tau mass ratio", Html.fromHtml("2.875 92 x 10<sup><small>-4</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 26 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Triton mass ratio", Html.fromHtml("1.819 200 062 203 x 10<sup><small>-4</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 084 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Fermi Coupling constant", Html.fromHtml("1.166 3787 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "GeV<sup><small>-2</small></sup>"),Html.fromHtml( "0.000 0006 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Fine-Structure constant", Html.fromHtml("7.297 352 5664 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 0017 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "Hartree energy ", Html.fromHtml("4.359 744 650 x 10<sup><small>-18</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 054  x 10<sup><small>-18</small></sup>")),
                    new ListViewItem(R.drawable.star, "Hartree energy in eV", Html.fromHtml("27.211 386 02"), Html.fromHtml("eV"), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Helion g factor", Html.fromHtml("-4.255 250 616"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 050")),
                    new ListViewItem(R.drawable.star, "Helion magnetic moment", Html.fromHtml("-1.074 617 522 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 014 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.158 740 958 x 10<sup><small>-3</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "Helion magnetic moment to nuclear magneton ratio", Html.fromHtml("-2.127 625 308"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 025")),
                    new ListViewItem(R.drawable.star, "Helion mass", Html.fromHtml("5.006 412 700 x 10<sup><small>-27</small></sup>"),Html.fromHtml("kg"), Html.fromHtml("0.000 000 062 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion mass energy equivalent ", Html.fromHtml("4.499 539 341 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 055 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion mass energy equivalent in MeV", Html.fromHtml("2808.391 586 "), Html.fromHtml("MeV"),Html.fromHtml( "0.000 017")),

                    new ListViewItem(R.drawable.star, "Helion mass in u", Html.fromHtml("3.014 932 246 73"), Html.fromHtml("u"), Html.fromHtml("0.000 000 000 12")),
                    new ListViewItem(R.drawable.star, "Helion molar mass", Html.fromHtml("3.014 932 246 73 x 10<sup><small>-3</small></sup>"),Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 000 12 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion-Electron mass ratio", Html.fromHtml("5495.885 279 22"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 27")),
                    new ListViewItem(R.drawable.star, "Helion-Proton mass ratio ", Html.fromHtml("2.993 152 670 46"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 000 29")),
                    new ListViewItem(R.drawable.star, "Inverse Fine-Structure constant ", Html.fromHtml("137.035 999 139"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 031")),

                    new ListViewItem(R.drawable.star, "Muon Compton wavelength", Html.fromHtml("11.734 441 11 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 26 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon Compton wavelength over 2 pi", Html.fromHtml("1.867 594 308 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"), Html.fromHtml("0.000 000 042 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon g factor", Html.fromHtml("-2.002 331 8418"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 0013")),
                    new ListViewItem(R.drawable.star, "Muon magnetic moment", Html.fromHtml("-4.490 448 26 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup> "), Html.fromHtml("0.000 000 10 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon magnetic moment anomaly", Html.fromHtml("1.165 920 89 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 63 x 10<sup><small>-3</small></sup> ")),

//here

                    new ListViewItem(R.drawable.star, "muon magnetic moment to Bohr magneton ratio", Html.fromHtml("-4.841 970 48 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 11 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon magnetic moment to nuclear magneton ratio", Html.fromHtml("-8.890 597 05"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "Muon mass", Html.fromHtml("1.883 531 594 x 10<sup><small>-28</small></sup>"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 048 x 10<sup><small>-28</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon mass energy equivalent", Html.fromHtml("1.692 833 774 x 10<sup><small>-11</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 043 x 10<sup><small>-11</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon mass energy equivalent in MeV", Html.fromHtml("105.658 3745"),Html.fromHtml( "MeV"),Html.fromHtml("0.000 0024")),
                    new ListViewItem(R.drawable.star, "muon mass in u ", Html.fromHtml("0.113 428 9257"),Html.fromHtml( "u"),Html.fromHtml("0.000 000 0025")),

                    new ListViewItem(R.drawable.star, "muon molar mass", Html.fromHtml("0.113 428 9257 x 10<sup><small>-3</small></sup>"), Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0025 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon-electron mass ratio", Html.fromHtml("206.768 2826"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 0046")),
                    new ListViewItem(R.drawable.star, "muon-neutron mass ratio ", Html.fromHtml("0.112 454 5167"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0025")),
                    new ListViewItem(R.drawable.star, "muon-proton magnetic moment ratio ", Html.fromHtml("-3.183 345 142"),Html.fromHtml( "(none)"),Html.fromHtml( "-3.183 345 142")),
                    new ListViewItem(R.drawable.star, "muon-proton mass ratio", Html.fromHtml("0.112 609 5262"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0025")),
//
                    new ListViewItem(R.drawable.star, "muon-tau mass ratio", Html.fromHtml("5.946 49 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 54 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron Compton wavelength", Html.fromHtml("1.319 590 904 81 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 000 88 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron Compton wavelength over 2 pi ",Html.fromHtml( "0.210 019 415 36 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 000 000 14 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron g factor", Html.fromHtml("-3.826 085 45"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 90")),
//
                    new ListViewItem(R.drawable.star, "neutron gyromagnetic ratio", Html.fromHtml("1.832 471 72 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 43 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron gyromagnetic ratio over 2 pi", Html.fromHtml("29.164 6933"),Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0069")),
                    new ListViewItem(R.drawable.star, "neutron magnetic moment", Html.fromHtml("-0.966 236 50 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 23 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.041 875 63 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 25 x 10<sup><small>-3</small></sup>")),
//here
                    new ListViewItem(R.drawable.star, "neutron magnetic moment to nuclear magneton ratio", Html.fromHtml("-1.913 042 73"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 45")),
                    new ListViewItem(R.drawable.star, "neutron mass", Html.fromHtml("1.674 927 471 x 10<sup><small>-27</small></sup>"),Html.fromHtml("kg"), Html.fromHtml("0.000 000 021 x 10<sup><small>-27</small></sup>")),

                    new ListViewItem(R.drawable.star, "neutron mass energy equivalent ", Html.fromHtml("1.505 349 739 x 10<sup><small>-10</small></sup>"),Html.fromHtml(" J "),Html.fromHtml( "0.000 000 019 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron mass energy equivalent in MeV", Html.fromHtml("939.565 4133"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0058")),
                    new ListViewItem(R.drawable.star, "neutron mass in u", Html.fromHtml("1.008 664 915 88"),Html.fromHtml("u"),Html.fromHtml( "0.000 000 000 49")),
                    new ListViewItem(R.drawable.star, "neutron molar mass", Html.fromHtml("1.008 664 915 88 x 10<sup><small>-3</small></sup>"), Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 49 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron to shielded proton magnetic moment ratio", Html.fromHtml("-0.684 996 94"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 16")),
                    new ListViewItem(R.drawable.star, "neutron-electron magnetic moment ratio", Html.fromHtml("1.040 668 82 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 25 x 10<sup><small>-3</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "neutron-electron mass ratio", Html.fromHtml("1838.683 661 58"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 90")),
                    new ListViewItem(R.drawable.star, "neutron-muon mass ratio", Html.fromHtml("8.892 484 08"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "neutron-proton magnetic moment ratio", Html.fromHtml("-0.684 979 34"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 16")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference", Html.fromHtml("2.305 573 77 x 10<sup><small>-30</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 85 x 10<sup><small>-30</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference energy equivalent", Html.fromHtml("2.072 146 37 x 10<sup><small>-13</small></sup>"),Html.fromHtml( "J"),Html.fromHtml( "0.000 000 76 x 10<sup><small>-13</small></sup>")),

                    new ListViewItem(R.drawable.star, "neutron-proton mass difference energy equivalent in MeV", Html.fromHtml("1.293 332 05"),Html.fromHtml("MeV"),Html.fromHtml( "0.000 000 48")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference in u", Html.fromHtml("0.001 388 449 00"),Html.fromHtml( "u"),Html.fromHtml( "0.000 000 000 51")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass ratio", Html.fromHtml("1.001 378 418 98"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 000 51")),
                    new ListViewItem(R.drawable.star, "neutron-tau mass ratio", Html.fromHtml("0.528 790"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 048")),
                    new ListViewItem(R.drawable.star, "proton charge to mass quotient", Html.fromHtml("9.578 833 226 x 10<sup><small>7</small></sup>"),Html.fromHtml( "C <sup><small>.</small></sup> kg<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 059 x 10<sup><small>7</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton Compton wavelength", Html.fromHtml("1.321 409 853 96 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml("0.000 000 000 61 x 10<sup><small>-15</small></sup>")),

                    new ListViewItem(R.drawable.star, "proton Compton wavelength over 2 pi ", Html.fromHtml("0.210 308 910 109 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 000 097 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton g factor", Html.fromHtml("5.585 694 702"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 017")),
                    new ListViewItem(R.drawable.star, "proton gyromagnetic ratio", Html.fromHtml("2.675 221 900 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 018 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton gyromagnetic ratio over 2 pi", Html.fromHtml("42.577 478 92"),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 29")),
                    new ListViewItem(R.drawable.star, "proton magnetic moment", Html.fromHtml("1.410 606 7873 x 10<sup><small>-26</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0097 x 10<sup><small>-26</small></sup>")),

                    new ListViewItem(R.drawable.star, "proton magnetic moment to Bohr magneton ratio", Html.fromHtml("1.521 032 2053 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 0046 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton magnetic moment to nuclear magneton ratio", Html.fromHtml("2.792 847 3508"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 0085")),
                    //here
                    new ListViewItem(R.drawable.star, "proton magnetic shielding correction", Html.fromHtml("25.691 x 10<sup><small>-6</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.011 x 10<sup><small>-6</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton mass", Html.fromHtml("1.672 621 898 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 021 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton mass energy equivalent", Html.fromHtml("1.503 277 593 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"),Html.fromHtml( "0.000 000 018 x 10<sup><small>-10</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "proton mass energy equivalent in MeV", Html.fromHtml("938.272 0813"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0058")),
                    new ListViewItem(R.drawable.star, "proton mass in u", Html.fromHtml("1.007 276 466 879"), Html.fromHtml("u"),Html.fromHtml( "0.000 000 000 091")),
                    new ListViewItem(R.drawable.star, "proton molar mass",Html.fromHtml( "1.007 276 466 879 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 091 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton rms charge radius ", Html.fromHtml("0.8751 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.0061 x 10<sup><small>-15</small></sup>")),
//here!
                    new ListViewItem(R.drawable.star, "proton-electron mass ratio", Html.fromHtml("1836.152 673 89"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 17")),
                    new ListViewItem(R.drawable.star, "proton-muon mass ratio", Html.fromHtml("8.880 243 38"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "proton-neutron magnetic moment ratio",Html.fromHtml( "-1.459 898 05"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 34")),
                    new ListViewItem(R.drawable.star, "proton-neutron mass ratio", Html.fromHtml("0.998 623 478 44"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 51")),
//
                    new ListViewItem(R.drawable.star, "proton-tau mass ratio", Html.fromHtml("0.528 063"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 048")),
                    new ListViewItem(R.drawable.star, "quantum of circulation", Html.fromHtml("3.636 947 5486 x 10<sup><small>-4</small></sup>"),Html.fromHtml("m<sup><small>2</small></sup> <sup><small>.</small></sup> s<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0017 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "quantum of circulation times 2", Html.fromHtml("7.273 895 0972 x 10<sup><small>-4</small></sup>"), Html.fromHtml("m<sup><small>2</small></sup> <sup><small>.</small></sup> s<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 0033 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Rydberg constant", Html.fromHtml("10 973 731.568 508"),Html.fromHtml( "m<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 065")),

                    new ListViewItem(R.drawable.star, "Rydberg constant times c in Hz", Html.fromHtml("3.289 841 960 355 x 10<sup><small>15</small></sup>"),Html.fromHtml( "Hz"),Html.fromHtml( "0.000 000 000 019 x 10<sup><small>15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Rydberg constant times hc in eV", Html.fromHtml("13.605 693 009"),Html.fromHtml("eV"),Html.fromHtml( "0.000 000 084")),
                    new ListViewItem(R.drawable.star, "Rydberg constant times hc in J", Html.fromHtml("2.179 872 325 x 10<sup><small>-18</small></sup>"), Html.fromHtml("J"), Html.fromHtml("0.000 000 027 x 10<sup><small>-18</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion gyromagnetic ratio", Html.fromHtml("2.037 894 585 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 027 x 10<sup><small>8</small></sup>")),

                    new ListViewItem(R.drawable.star, "shielded helion gyromagnetic ratio over 2 pi ", Html.fromHtml("32.434 099 66"), Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 43")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment", Html.fromHtml("-1.074 553 080 x 10<sup><small>-26</small></sup>"),Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.158 671 471 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment to nuclear magneton ratio", Html.fromHtml("-2.127 497 720"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 025")),
                    new ListViewItem(R.drawable.star, "shielded helion to proton magnetic moment ratio ", Html.fromHtml("-0.761 766 5603"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0092")),
//
                    new ListViewItem(R.drawable.star, "shielded helion to shielded proton magnetic moment ratio", Html.fromHtml("-0.761 786 1313"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0033")),
                    new ListViewItem(R.drawable.star, "shielded proton gyromagnetic ratio", Html.fromHtml("2.675 153 171 x 10<sup><small>8</small></sup>"), Html.fromHtml("s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 033 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded proton gyromagnetic ratio over 2 pi ",Html.fromHtml( "5.050 783 699 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 031 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in (eV)/T ", Html.fromHtml("42.576 385 07"),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 53")),
//
                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment", Html.fromHtml("1.410 570 547 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 018 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment to Bohr magneton ratio", Html.fromHtml("1.520 993 128 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 017 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment to nuclear magneton ratio", Html.fromHtml("2.792 775 600"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 030")),
                    new ListViewItem(R.drawable.star, "tau Compton wavelength", Html.fromHtml("0.697 787 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 063 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau Compton wavelength over 2 pi", Html.fromHtml("0.111 056 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.000 010 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass", Html.fromHtml("3.167 47 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"),Html.fromHtml( "0.000 29 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass energy equivalent ", Html.fromHtml("2.846 78 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"),Html.fromHtml("0.000 26 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass energy equivalent in MeV", Html.fromHtml("1776.82"),Html.fromHtml( "MeV"),Html.fromHtml("0.16")),
//
                    new ListViewItem(R.drawable.star, "tau mass in u", Html.fromHtml("1.907 49"), Html.fromHtml("u"),Html.fromHtml( "0.000 17")),
                    new ListViewItem(R.drawable.star, "tau molar mass", Html.fromHtml("1.907 49 x 10<sup><small>-3</small></sup>"),Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 17 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau-electron mass ratio", Html.fromHtml("3477.15"),Html.fromHtml( "(none)"),Html.fromHtml( "0.31")),
                    new ListViewItem(R.drawable.star, "First Radiation constant for spectral radiance", Html.fromHtml("1.191 042 953 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>  sr<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 100 kPa)", Html.fromHtml("2.651 6467 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
//
//
            };





    HashMap<String,ListViewItem> atomicMap = new HashMap<String, ListViewItem>();


    ListViewItem constant_chemical_data[] = new ListViewItem[]
            {

                    new ListViewItem(R.drawable.star, "Atomic mass constant ", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 020 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Avogadro constant", Html.fromHtml("6.022 140 857 x 10<sup><small>23</small></sup>"),Html.fromHtml(" mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 074 x 10<sup><small>23</small></sup>")),

                    new ListViewItem(R.drawable.star, "Atomic mass constant energy equivalent", Html.fromHtml("1.492 418 062 x 10<sup><small>-10</small></sup>"),Html.fromHtml(" J "),Html.fromHtml( "0.000 000 018 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Atomic mass constant energy equivalent in MeV ", Html.fromHtml("931.494 0954"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0057")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant", Html.fromHtml("1.380 648 52 x 10<sup><small>-23</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 79 x 10<sup><small>-23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in eV/K ", Html.fromHtml("8.617 3303 x 10<sup><small>-5</small></sup>"), Html.fromHtml("eV <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0050 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in Hz/K", Html.fromHtml("2.083 6612 x 10<sup><small>10</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml("0.000 0012 x 10<sup><small>10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in inverse meters per kelvin", Html.fromHtml("69.503 457"),Html.fromHtml( "m<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml("0.000 040")),
//
                    new ListViewItem(R.drawable.star, "Faraday constant", Html.fromHtml("96 485.332 89"), Html.fromHtml("C <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 59")),
                    new ListViewItem(R.drawable.star, "Faraday constant for conventional electric current", Html.fromHtml("96 485.3251"),Html.fromHtml("C<sub><small>90</small></sub> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.0012")),
                    new ListViewItem(R.drawable.star, "First Radiation constant", Html.fromHtml("3.741 771 790 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>"),Html.fromHtml( "0.000 000 046 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "First Radiation constant for spectral radiance", Html.fromHtml("1.191 042 953 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>  sr<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 100 kPa)", Html.fromHtml("2.651 6467 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 101.325 kPa)", Html.fromHtml("2.686 7811 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar gas constant", Html.fromHtml("8.314 4598 "), Html.fromHtml("J mol<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0048")),
                    new ListViewItem(R.drawable.star, "Molar Planck constant",Html.fromHtml( "3.990 312 7110 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> s <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0018 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Planck constant times c ", Html.fromHtml("0.119 626 565 582"),Html.fromHtml( "J <sup><small>.</small></sup> m <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 054")),
//
                    new ListViewItem(R.drawable.star, "Molar Volume of ideal gas (273.15 K, 100 kPa)", Html.fromHtml("22.710 947 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "m<sup><small>3</small></sup> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Volume of ideal gas (273.15 K, 101.325 kPa)", Html.fromHtml("22.413 962 x 10<sup><small>-3</small></sup>"),Html.fromHtml("m<sup><small>3</small></sup> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Sackur-Tetrode constant (1 K, 100 kPa) ", Html.fromHtml("-1.151 7084"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0014")),
                    new ListViewItem(R.drawable.star, "Sackur-Tetrode constant (1 K, 101.325 kPa)", Html.fromHtml("-1.164 8714"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 0014")),

                    new ListViewItem(R.drawable.star, "Second Radiation constant", Html.fromHtml("1.438 777 36 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "m <sup><small>.</small></sup> K"),Html.fromHtml( "0.000 000 83 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "Stefan-Boltzmann constant", Html.fromHtml("5.670 367 x 10<sup><small>-8</small></sup>"),Html.fromHtml("W <sup><small>.</small></sup> m<sup><small>-2</small></sup> K<sup><small>-4</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-8</small></sup>")),
                    new ListViewItem(R.drawable.star, "Wien Frequency displacement law constant", Html.fromHtml("5.878 9238 x 10<sup><small>10</small></sup>"), Html.fromHtml(" Hz <sup><small>.</small></sup> K<sup><small>-1</small></sup>"), Html.fromHtml("0.000 0034 x 10<sup><small>10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Wien Wavelength displacement law constant ", Html.fromHtml("2.897 7729 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "m <sup><small>.</small></sup> K"),Html.fromHtml( "0.000 0017 x 10<sup><small>-3</small></sup>"))

            };
    HashMap<String,ListViewItem> chemMap = new HashMap<String, ListViewItem>();


    ListViewItem all_data[] = new ListViewItem[]
            {

                    new ListViewItem(R.drawable.star, "Atomic mass constant ", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 020 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Avogadro constant", Html.fromHtml("6.022 140 857 x 10<sup><small>23</small></sup>"),Html.fromHtml(" mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 074 x 10<sup><small>23</small></sup>")),

                    new ListViewItem(R.drawable.star, "Atomic mass constant energy equivalent", Html.fromHtml("1.492 418 062 x 10<sup><small>-10</small></sup>"),Html.fromHtml(" J "),Html.fromHtml( "0.000 000 018 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Atomic mass constant energy equivalent in MeV ", Html.fromHtml("931.494 0954"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0057")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant", Html.fromHtml("1.380 648 52 x 10<sup><small>-23</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 79 x 10<sup><small>-23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in eV/K ", Html.fromHtml("8.617 3303 x 10<sup><small>-5</small></sup>"), Html.fromHtml("eV <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0050 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in Hz/K", Html.fromHtml("2.083 6612 x 10<sup><small>10</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml("0.000 0012 x 10<sup><small>10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann constant in inverse meters per kelvin", Html.fromHtml("69.503 457"),Html.fromHtml( "m<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml("0.000 040")),
//
                    new ListViewItem(R.drawable.star, "Faraday constant", Html.fromHtml("96 485.332 89"), Html.fromHtml("C <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 59")),
                    new ListViewItem(R.drawable.star, "Faraday constant for conventional electric current", Html.fromHtml("96 485.3251"),Html.fromHtml("C<sub><small>90</small></sub> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.0012")),
                    new ListViewItem(R.drawable.star, "First Radiation constant", Html.fromHtml("3.741 771 790 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>"),Html.fromHtml( "0.000 000 046 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "First Radiation constant for spectral radiance", Html.fromHtml("1.191 042 953 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>  sr<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 100 kPa)", Html.fromHtml("2.651 6467 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 101.325 kPa)", Html.fromHtml("2.686 7811 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar gas constant", Html.fromHtml("8.314 4598 "), Html.fromHtml("J mol<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0048")),
                    new ListViewItem(R.drawable.star, "Molar Planck constant",Html.fromHtml( "3.990 312 7110 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> s <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0018 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Planck constant times c ", Html.fromHtml("0.119 626 565 582"),Html.fromHtml( "J <sup><small>.</small></sup> m <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 054")),
//
                    new ListViewItem(R.drawable.star, "Molar Volume of ideal gas (273.15 K, 100 kPa)", Html.fromHtml("22.710 947 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "m<sup><small>3</small></sup> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Volume of ideal gas (273.15 K, 101.325 kPa)", Html.fromHtml("22.413 962 x 10<sup><small>-3</small></sup>"),Html.fromHtml("m<sup><small>3</small></sup> <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Sackur-Tetrode constant (1 K, 100 kPa) ", Html.fromHtml("-1.151 7084"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0014")),
                    new ListViewItem(R.drawable.star, "Sackur-Tetrode constant (1 K, 101.325 kPa)", Html.fromHtml("-1.164 8714"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 0014")),

                    new ListViewItem(R.drawable.star, "Second Radiation constant", Html.fromHtml("1.438 777 36 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "m <sup><small>.</small></sup> K"),Html.fromHtml( "0.000 000 83 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "Stefan-Boltzmann constant", Html.fromHtml("5.670 367 x 10<sup><small>-8</small></sup>"),Html.fromHtml("W <sup><small>.</small></sup> m<sup><small>-2</small></sup> K<sup><small>-4</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-8</small></sup>")),
                    new ListViewItem(R.drawable.star, "Wien Frequency displacement law constant", Html.fromHtml("5.878 9238 x 10<sup><small>10</small></sup>"), Html.fromHtml(" Hz <sup><small>.</small></sup> K<sup><small>-1</small></sup>"), Html.fromHtml("0.000 0034 x 10<sup><small>10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Wien Wavelength displacement law constant ", Html.fromHtml("2.897 7729 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "m <sup><small>.</small></sup> K"),Html.fromHtml( "0.000 0017 x 10<sup><small>-3</small></sup>")),


                    new ListViewItem(R.drawable.star, "Alpha Particle Mass", Html.fromHtml("6.644 657 230 x 10<sup><small>-27</small></sup>"),Html.fromHtml(" kg"),Html.fromHtml( "0.000 000 082 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass energy equivalent", Html.fromHtml("5.971 920 097 x 10<sup><small>-10</small></sup>"), Html.fromHtml("J"), Html.fromHtml("0.000 000 073 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass energy equivalent in MeV ", Html.fromHtml("3727.379 378"),Html.fromHtml(" MeV"), Html.fromHtml("0.000 023")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Mass in u", Html.fromHtml("4.001 506 179 127"), Html.fromHtml("u"), Html.fromHtml("0.000 000 000 063")),
                    new ListViewItem(R.drawable.star, "Alpha Particle Molar mass", Html.fromHtml("4.001 506 179 127 x 10<sup><small>-3</small></sup>"), Html.fromHtml("mol<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 000 063 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Alpha Particle-Electron mass ratio", Html.fromHtml("7294.299 541 36"), Html.fromHtml("(none)"),Html.fromHtml("0.000 000 24")),
//
                    new ListViewItem(R.drawable.star, "Alpha Particle-Proton mass ratio ", Html.fromHtml("3.972 599 689 07"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 36")),
                    new ListViewItem(R.drawable.star, "Bohr Radius", Html.fromHtml("0.529 177 210 67 x 10<sup><small>-10</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 000 12 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Classical Electron Radius", Html.fromHtml("2.817 940 3227 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.000 000 0019 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Compton Wavelength", Html.fromHtml("2.426 310 2367 x 10<sup><small>-12</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 0011 x 10<sup><small>-12</small></sup>")),

                    new ListViewItem(R.drawable.star, "Compton Wavelength over 2 pi", Html.fromHtml("386.159 267 64 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 18 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron g factor ", Html.fromHtml("0.857 438 2311"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0048")),

                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment ", Html.fromHtml("0.433 073 5040 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 0036 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment to Bohr magneton ratio ", Html.fromHtml("0.466 975 4554 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0026 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron Magnetic Moment to nuclear magneton ratio", Html.fromHtml("0.857 438 2311"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0048")),
                    new ListViewItem(R.drawable.star, "Deuteron mass ", Html.fromHtml("3.343 583 719 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 041 x 10<sup><small>-27</small></sup>")),

                    new ListViewItem(R.drawable.star, "Deuteron mass energy equivalent ", Html.fromHtml("3.005 063 183 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 037 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron mass energy equivalent in MeV", Html.fromHtml(" 1875.612 928"),Html.fromHtml("MeV"), Html.fromHtml("0.000 012")),
                    new ListViewItem(R.drawable.star, "Deuteron mass in u", Html.fromHtml("2.013 553 212 745"),Html.fromHtml( "u"), Html.fromHtml("0.000 000 000 040")),
                    new ListViewItem(R.drawable.star, "Deuteron molar mass", Html.fromHtml("2.013 553 212 745 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 040 x 10<sup><small>-3</small></sup>")),


                    new ListViewItem(R.drawable.star, "Deuteron rms charge radius", Html.fromHtml("2.1413 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.0025 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron-Electron magnetic moment ratio", Html.fromHtml("-4.664 345 535 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 026 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Deuteron-Electron mass ratio", Html.fromHtml("3670.482 967 85"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 13")),
                    new ListViewItem(R.drawable.star, "Deuteron-Neutron magnetic moment ratio", Html.fromHtml("-0.448 206 52"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 11")),
                    new ListViewItem(R.drawable.star, "Deuteron-Proton magnetic moment ratio", Html.fromHtml("0.307 012 2077"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 0015")),
                    new ListViewItem(R.drawable.star, "Deuteron-Proton mass ratio", Html.fromHtml("1.999 007 500 87"), Html.fromHtml("(none)"),Html.fromHtml("0.000 000 000 19")),

                    new ListViewItem(R.drawable.star, "Electron charge to mass quotient", Html.fromHtml("-1.758 820 024 x 10<sup><small>11</small></sup>"), Html.fromHtml("C <sup><small>.</small></sup> kg<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 011 x 10<sup><small>11</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron g factor ", Html.fromHtml("-2.002 319 304 361 82"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 000 52")),
                    new ListViewItem(R.drawable.star, "Electron gyromagnetic ratio", Html.fromHtml("1.760 859 644 x 10<sup><small>11</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 011 x 10<sup><small>11</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron gyromagnetic ratio over 2 pi ", Html.fromHtml("28 024.951 64 "),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 17")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment ", Html.fromHtml("-928.476 4620 x 10<sup><small>-26</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 0057 x 10<sup><small>-26</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron magnetic moment anomaly", Html.fromHtml("1.159 652 180 91 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 000 26  x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.001 159 652 180 91"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 000 26")),
                    new ListViewItem(R.drawable.star, "Electron magnetic moment to nuclear magneton ratio", Html.fromHtml("-1838.281 972 34"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Electron mass", Html.fromHtml("9.109 383 56 x 10<sup><small>-31</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 11 x 10<sup><small>-31</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron mass energy equivalent", Html.fromHtml("8.187 105 65 x 10<sup><small>-14</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 10 x 10<sup><small>-14</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron mass energy equivalent in MeV", Html.fromHtml("0.510 998 9461"),Html.fromHtml( "MeV"), Html.fromHtml("0.000 000 0031")),
                    new ListViewItem(R.drawable.star, "Electron mass in u ", Html.fromHtml("5.485 799 090 70 x 10<sup><small>-4</small></sup>"),Html.fromHtml("u"), Html.fromHtml("0.000 000 000 16 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron Molar mass", Html.fromHtml("5.485 799 090 70 x 10<sup><small>-7</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 000 16 x 10<sup><small>-7</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron to Alpha Particle mass ratio", Html.fromHtml("1.370 933 554 798 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 000 045 x 10<sup><small>-4</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron to Shielded Helion magnetic moment ratio", Html.fromHtml("864.058 257"), Html.fromHtml("(none)"), Html.fromHtml("0.000 010")),
                    new ListViewItem(R.drawable.star, "Electron to Shielded Proton magnetic moment ratio", Html.fromHtml("-658.227 5971"),Html.fromHtml("(none)"), Html.fromHtml("0.000 0072")),
                    new ListViewItem(R.drawable.star, "Electron-deuteron magnetic moment ratio", Html.fromHtml("-2143.923 499"), Html.fromHtml("(none)"), Html.fromHtml("0.000 012")),
                    new ListViewItem(R.drawable.star, "Electron-deuteron mass ratio", Html.fromHtml("2.724 437 107 484 x 10<sup><small>-4</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 000 096 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-helion mass ratio ", Html.fromHtml("1.819 543 074 854 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 088 x 10<sup><small>-4</small></sup>")),

                    new ListViewItem(R.drawable.star, "Electron-Muon magnetic moment ratio ", Html.fromHtml("206.766 9880"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0046")),
                    new ListViewItem(R.drawable.star, "Electron-Muon mass ratio", Html.fromHtml("4.836 331 70 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 11 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Neutron magnetic moment ratio", Html.fromHtml("960.920 50"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 23")),
                    new ListViewItem(R.drawable.star, "Electron-Neutron mass ratio", Html.fromHtml("5.438 673 4428 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 0027 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Proton magnetic moment ratio", Html.fromHtml("-658.210 6866"), Html.fromHtml("(none)"), Html.fromHtml("0.000 0020")),

//
                    new ListViewItem(R.drawable.star, "Electron-Proton mass ratio", Html.fromHtml("5.446 170 213 52 x 10<sup><small>-4</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 000 52 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Tau mass ratio", Html.fromHtml("2.875 92 x 10<sup><small>-4</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 26 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron-Triton mass ratio", Html.fromHtml("1.819 200 062 203 x 10<sup><small>-4</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 084 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Fermi Coupling constant", Html.fromHtml("1.166 3787 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "GeV<sup><small>-2</small></sup>"),Html.fromHtml( "0.000 0006 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Fine-Structure constant", Html.fromHtml("7.297 352 5664 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 0017 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "Hartree energy ", Html.fromHtml("4.359 744 650 x 10<sup><small>-18</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 054  x 10<sup><small>-18</small></sup>")),
                    new ListViewItem(R.drawable.star, "Hartree energy in eV", Html.fromHtml("27.211 386 02"), Html.fromHtml("eV"), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Helion g factor", Html.fromHtml("-4.255 250 616"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 050")),
                    new ListViewItem(R.drawable.star, "Helion magnetic moment", Html.fromHtml("-1.074 617 522 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 014 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.158 740 958 x 10<sup><small>-3</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "Helion magnetic moment to nuclear magneton ratio", Html.fromHtml("-2.127 625 308"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 025")),
                    new ListViewItem(R.drawable.star, "Helion mass", Html.fromHtml("5.006 412 700 x 10<sup><small>-27</small></sup>"),Html.fromHtml("kg"), Html.fromHtml("0.000 000 062 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion mass energy equivalent ", Html.fromHtml("4.499 539 341 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"), Html.fromHtml("0.000 000 055 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion mass energy equivalent in MeV", Html.fromHtml("2808.391 586 "), Html.fromHtml("MeV"),Html.fromHtml( "0.000 017")),

                    new ListViewItem(R.drawable.star, "Helion mass in u", Html.fromHtml("3.014 932 246 73"), Html.fromHtml("u"), Html.fromHtml("0.000 000 000 12")),
                    new ListViewItem(R.drawable.star, "Helion molar mass", Html.fromHtml("3.014 932 246 73 x 10<sup><small>-3</small></sup>"),Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 000 12 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "Helion-Electron mass ratio", Html.fromHtml("5495.885 279 22"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 27")),
                    new ListViewItem(R.drawable.star, "Helion-Proton mass ratio ", Html.fromHtml("2.993 152 670 46"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 000 29")),
                    new ListViewItem(R.drawable.star, "Inverse Fine-Structure constant ", Html.fromHtml("137.035 999 139"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 031")),

                    new ListViewItem(R.drawable.star, "Muon Compton wavelength", Html.fromHtml("11.734 441 11 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"), Html.fromHtml("0.000 000 26 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon Compton wavelength over 2 pi", Html.fromHtml("1.867 594 308 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"), Html.fromHtml("0.000 000 042 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon g factor", Html.fromHtml("-2.002 331 8418"),Html.fromHtml( "(none)"), Html.fromHtml("0.000 000 0013")),
                    new ListViewItem(R.drawable.star, "Muon magnetic moment", Html.fromHtml("-4.490 448 26 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup> "), Html.fromHtml("0.000 000 10 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Muon magnetic moment anomaly", Html.fromHtml("1.165 920 89 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 63 x 10<sup><small>-3</small></sup> ")),

//here

                    new ListViewItem(R.drawable.star, "muon magnetic moment to Bohr magneton ratio", Html.fromHtml("-4.841 970 48 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 11 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon magnetic moment to nuclear magneton ratio", Html.fromHtml("-8.890 597 05"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "Muon mass", Html.fromHtml("1.883 531 594 x 10<sup><small>-28</small></sup>"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 048 x 10<sup><small>-28</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon mass energy equivalent", Html.fromHtml("1.692 833 774 x 10<sup><small>-11</small></sup>"), Html.fromHtml("J"),Html.fromHtml( "0.000 000 043 x 10<sup><small>-11</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon mass energy equivalent in MeV", Html.fromHtml("105.658 3745"),Html.fromHtml( "MeV"),Html.fromHtml("0.000 0024")),
                    new ListViewItem(R.drawable.star, "muon mass in u ", Html.fromHtml("0.113 428 9257"),Html.fromHtml( "u"),Html.fromHtml("0.000 000 0025")),

                    new ListViewItem(R.drawable.star, "muon molar mass", Html.fromHtml("0.113 428 9257 x 10<sup><small>-3</small></sup>"), Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0025 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "muon-electron mass ratio", Html.fromHtml("206.768 2826"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 0046")),
                    new ListViewItem(R.drawable.star, "muon-neutron mass ratio ", Html.fromHtml("0.112 454 5167"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0025")),
                    new ListViewItem(R.drawable.star, "muon-proton magnetic moment ratio ", Html.fromHtml("-3.183 345 142"),Html.fromHtml( "(none)"),Html.fromHtml( "-3.183 345 142")),
                    new ListViewItem(R.drawable.star, "muon-proton mass ratio", Html.fromHtml("0.112 609 5262"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0025")),
//
                    new ListViewItem(R.drawable.star, "muon-tau mass ratio", Html.fromHtml("5.946 49 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 54 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron Compton wavelength", Html.fromHtml("1.319 590 904 81 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 000 88 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron Compton wavelength over 2 pi ",Html.fromHtml( "0.210 019 415 36 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 000 000 14 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron g factor", Html.fromHtml("-3.826 085 45"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 90")),
//
                    new ListViewItem(R.drawable.star, "neutron gyromagnetic ratio", Html.fromHtml("1.832 471 72 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 43 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron gyromagnetic ratio over 2 pi", Html.fromHtml("29.164 6933"),Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0069")),
                    new ListViewItem(R.drawable.star, "neutron magnetic moment", Html.fromHtml("-0.966 236 50 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 23 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.041 875 63 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 25 x 10<sup><small>-3</small></sup>")),
//here
                    new ListViewItem(R.drawable.star, "neutron magnetic moment to nuclear magneton ratio", Html.fromHtml("-1.913 042 73"), Html.fromHtml("(none)"), Html.fromHtml("0.000 000 45")),
                    new ListViewItem(R.drawable.star, "neutron mass", Html.fromHtml("1.674 927 471 x 10<sup><small>-27</small></sup>"),Html.fromHtml("kg"), Html.fromHtml("0.000 000 021 x 10<sup><small>-27</small></sup>")),

                    new ListViewItem(R.drawable.star, "neutron mass energy equivalent ", Html.fromHtml("1.505 349 739 x 10<sup><small>-10</small></sup>"),Html.fromHtml(" J "),Html.fromHtml( "0.000 000 019 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron mass energy equivalent in MeV", Html.fromHtml("939.565 4133"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0058")),
                    new ListViewItem(R.drawable.star, "neutron mass in u", Html.fromHtml("1.008 664 915 88"),Html.fromHtml("u"),Html.fromHtml( "0.000 000 000 49")),
                    new ListViewItem(R.drawable.star, "neutron molar mass", Html.fromHtml("1.008 664 915 88 x 10<sup><small>-3</small></sup>"), Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 49 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron to shielded proton magnetic moment ratio", Html.fromHtml("-0.684 996 94"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 16")),
                    new ListViewItem(R.drawable.star, "neutron-electron magnetic moment ratio", Html.fromHtml("1.040 668 82 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml("0.000 000 25 x 10<sup><small>-3</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "neutron-electron mass ratio", Html.fromHtml("1838.683 661 58"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 90")),
                    new ListViewItem(R.drawable.star, "neutron-muon mass ratio", Html.fromHtml("8.892 484 08"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "neutron-proton magnetic moment ratio", Html.fromHtml("-0.684 979 34"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 16")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference", Html.fromHtml("2.305 573 77 x 10<sup><small>-30</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 85 x 10<sup><small>-30</small></sup>")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference energy equivalent", Html.fromHtml("2.072 146 37 x 10<sup><small>-13</small></sup>"),Html.fromHtml( "J"),Html.fromHtml( "0.000 000 76 x 10<sup><small>-13</small></sup>")),

                    new ListViewItem(R.drawable.star, "neutron-proton mass difference energy equivalent in MeV", Html.fromHtml("1.293 332 05"),Html.fromHtml("MeV"),Html.fromHtml( "0.000 000 48")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass difference in u", Html.fromHtml("0.001 388 449 00"),Html.fromHtml( "u"),Html.fromHtml( "0.000 000 000 51")),
                    new ListViewItem(R.drawable.star, "neutron-proton mass ratio", Html.fromHtml("1.001 378 418 98"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 000 51")),
                    new ListViewItem(R.drawable.star, "neutron-tau mass ratio", Html.fromHtml("0.528 790"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 048")),
                    new ListViewItem(R.drawable.star, "proton charge to mass quotient", Html.fromHtml("9.578 833 226 x 10<sup><small>7</small></sup>"),Html.fromHtml( "C <sup><small>.</small></sup> kg<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 059 x 10<sup><small>7</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton Compton wavelength", Html.fromHtml("1.321 409 853 96 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml("0.000 000 000 61 x 10<sup><small>-15</small></sup>")),

                    new ListViewItem(R.drawable.star, "proton Compton wavelength over 2 pi ", Html.fromHtml("0.210 308 910 109 x 10<sup><small>-15</small></sup>"), Html.fromHtml("m"),Html.fromHtml( "0.000 000 000 097 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton g factor", Html.fromHtml("5.585 694 702"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 017")),
                    new ListViewItem(R.drawable.star, "proton gyromagnetic ratio", Html.fromHtml("2.675 221 900 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 018 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton gyromagnetic ratio over 2 pi", Html.fromHtml("42.577 478 92"),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 29")),
                    new ListViewItem(R.drawable.star, "proton magnetic moment", Html.fromHtml("1.410 606 7873 x 10<sup><small>-26</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0097 x 10<sup><small>-26</small></sup>")),

                    new ListViewItem(R.drawable.star, "proton magnetic moment to Bohr magneton ratio", Html.fromHtml("1.521 032 2053 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 0046 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton magnetic moment to nuclear magneton ratio", Html.fromHtml("2.792 847 3508"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 0085")),
                    //here
                    new ListViewItem(R.drawable.star, "proton magnetic shielding correction", Html.fromHtml("25.691 x 10<sup><small>-6</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.011 x 10<sup><small>-6</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton mass", Html.fromHtml("1.672 621 898 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 021 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton mass energy equivalent", Html.fromHtml("1.503 277 593 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"),Html.fromHtml( "0.000 000 018 x 10<sup><small>-10</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "proton mass energy equivalent in MeV", Html.fromHtml("938.272 0813"),Html.fromHtml( "MeV"),Html.fromHtml( "0.000 0058")),
                    new ListViewItem(R.drawable.star, "proton mass in u", Html.fromHtml("1.007 276 466 879"), Html.fromHtml("u"),Html.fromHtml( "0.000 000 000 091")),
                    new ListViewItem(R.drawable.star, "proton molar mass",Html.fromHtml( "1.007 276 466 879 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 000 091 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "proton rms charge radius ", Html.fromHtml("0.8751 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.0061 x 10<sup><small>-15</small></sup>")),
//here!
                    new ListViewItem(R.drawable.star, "proton-electron mass ratio", Html.fromHtml("1836.152 673 89"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 17")),
                    new ListViewItem(R.drawable.star, "proton-muon mass ratio", Html.fromHtml("8.880 243 38"), Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 20")),
                    new ListViewItem(R.drawable.star, "proton-neutron magnetic moment ratio",Html.fromHtml( "-1.459 898 05"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 34")),
                    new ListViewItem(R.drawable.star, "proton-neutron mass ratio", Html.fromHtml("0.998 623 478 44"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 000 51")),
//
                    new ListViewItem(R.drawable.star, "proton-tau mass ratio", Html.fromHtml("0.528 063"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 048")),
                    new ListViewItem(R.drawable.star, "quantum of circulation", Html.fromHtml("3.636 947 5486 x 10<sup><small>-4</small></sup>"),Html.fromHtml("m<sup><small>2</small></sup> <sup><small>.</small></sup> s<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 0017 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "quantum of circulation times 2", Html.fromHtml("7.273 895 0972 x 10<sup><small>-4</small></sup>"), Html.fromHtml("m<sup><small>2</small></sup> <sup><small>.</small></sup> s<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 0033 x 10<sup><small>-4</small></sup>")),
                    new ListViewItem(R.drawable.star, "Rydberg constant", Html.fromHtml("10 973 731.568 508"),Html.fromHtml( "m<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 065")),

                    new ListViewItem(R.drawable.star, "Rydberg constant times c in Hz", Html.fromHtml("3.289 841 960 355 x 10<sup><small>15</small></sup>"),Html.fromHtml( "Hz"),Html.fromHtml( "0.000 000 000 019 x 10<sup><small>15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Rydberg constant times hc in eV", Html.fromHtml("13.605 693 009"),Html.fromHtml("eV"),Html.fromHtml( "0.000 000 084")),
                    new ListViewItem(R.drawable.star, "Rydberg constant times hc in J", Html.fromHtml("2.179 872 325 x 10<sup><small>-18</small></sup>"), Html.fromHtml("J"), Html.fromHtml("0.000 000 027 x 10<sup><small>-18</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion gyromagnetic ratio", Html.fromHtml("2.037 894 585 x 10<sup><small>8</small></sup>"),Html.fromHtml( "s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 027 x 10<sup><small>8</small></sup>")),

                    new ListViewItem(R.drawable.star, "shielded helion gyromagnetic ratio over 2 pi ", Html.fromHtml("32.434 099 66"), Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 43")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment", Html.fromHtml("-1.074 553 080 x 10<sup><small>-26</small></sup>"),Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment to Bohr magneton ratio", Html.fromHtml("-1.158 671 471 x 10<sup><small>-3</small></sup>"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 014 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded helion magnetic moment to nuclear magneton ratio", Html.fromHtml("-2.127 497 720"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 025")),
                    new ListViewItem(R.drawable.star, "shielded helion to proton magnetic moment ratio ", Html.fromHtml("-0.761 766 5603"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0092")),
//
                    new ListViewItem(R.drawable.star, "shielded helion to shielded proton magnetic moment ratio", Html.fromHtml("-0.761 786 1313"),Html.fromHtml( "(none)"),Html.fromHtml( "0.000 000 0033")),
                    new ListViewItem(R.drawable.star, "shielded proton gyromagnetic ratio", Html.fromHtml("2.675 153 171 x 10<sup><small>8</small></sup>"), Html.fromHtml("s<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 033 x 10<sup><small>8</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded proton gyromagnetic ratio over 2 pi ",Html.fromHtml( "5.050 783 699 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 031 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in (eV)/T ", Html.fromHtml("42.576 385 07"),Html.fromHtml( "MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 53")),
//
                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment", Html.fromHtml("1.410 570 547 x 10<sup><small>-26</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 018 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment to Bohr magneton ratio", Html.fromHtml("1.520 993 128 x 10<sup><small>-3</small></sup>"),Html.fromHtml("(none)"), Html.fromHtml("0.000 000 017 x 10<sup><small>-3</small></sup>")),

                    new ListViewItem(R.drawable.star, "shielded proton magnetic moment to nuclear magneton ratio", Html.fromHtml("2.792 775 600"),Html.fromHtml("(none)"),Html.fromHtml( "0.000 000 030")),
                    new ListViewItem(R.drawable.star, "tau Compton wavelength", Html.fromHtml("0.697 787 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 063 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau Compton wavelength over 2 pi", Html.fromHtml("0.111 056 x 10<sup><small>-15</small></sup>"),Html.fromHtml("m"),Html.fromHtml( "0.000 010 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass", Html.fromHtml("3.167 47 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"),Html.fromHtml( "0.000 29 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass energy equivalent ", Html.fromHtml("2.846 78 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "J"),Html.fromHtml("0.000 26 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau mass energy equivalent in MeV", Html.fromHtml("1776.82"),Html.fromHtml( "MeV"),Html.fromHtml("0.16")),
//
                    new ListViewItem(R.drawable.star, "tau mass in u", Html.fromHtml("1.907 49"), Html.fromHtml("u"),Html.fromHtml( "0.000 17")),
                    new ListViewItem(R.drawable.star, "tau molar mass", Html.fromHtml("1.907 49 x 10<sup><small>-3</small></sup>"),Html.fromHtml("kg <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 17 x 10<sup><small>-3</small></sup>")),
                    new ListViewItem(R.drawable.star, "tau-electron mass ratio", Html.fromHtml("3477.15"),Html.fromHtml( "(none)"),Html.fromHtml( "0.31")),
                    new ListViewItem(R.drawable.star, "First Radiation constant for spectral radiance", Html.fromHtml("1.191 042 953 x 10<sup><small>-16</small></sup>"),Html.fromHtml( "W <sup><small>.</small></sup> m<sup><small>2</small></sup>  sr<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>-16</small></sup>")),
                    new ListViewItem(R.drawable.star, "Loschmidt constant (273.15 K, 100 kPa)", Html.fromHtml("2.651 6467 x 10<sup><small>25</small></sup>"),Html.fromHtml( "m<sup><small>-3</small></sup>"),Html.fromHtml( "0.000 0015 x 10<sup><small>25</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Bohr Magneton ", Html.fromHtml("927.400 9994 x 10<sup><small>-26</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0057 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in (eV)/T", Html.fromHtml("5.788 381 8012 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "<sup>(eV)</sip>/<sub>T</sub>"),Html.fromHtml( "0.000 000 0026 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in Hz/T", Html.fromHtml("13.996 245 042 x 10<sup><small>9</small></sup>"),Html.fromHtml(" Hz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 086 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in inverse meters per tesla", Html.fromHtml("46.686 448 14"), Html.fromHtml("m<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 29")),
                    new ListViewItem(R.drawable.star, "Bohr magneton in K/T", Html.fromHtml("0.671 714 05"),Html.fromHtml( "K <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml("0.000 000 39")),
                    new ListViewItem(R.drawable.star, "Conductance Quantum", Html.fromHtml("7.748 091 7310 x 10<sup><small>-5</small></sup>"),Html.fromHtml( "s"),Html.fromHtml("0.000 000 0018 x 10<sup><small>-5</small></sup>")),

                    new ListViewItem(R.drawable.star, "Elementary Charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"), Html.fromHtml("C"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron Volt", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml(" J"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary Charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml( "C"),Html.fromHtml( "0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary Charge over h", Html.fromHtml("2.417 989 262 x 10<sup><small>14</small></sup>"),Html.fromHtml( "A <sup><small>.</small></sup> J<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 015 x 10<sup><small>14</small></sup>")),
                    new ListViewItem(R.drawable.star, "Inverse of Conductance quantum", Html.fromHtml("12 906.403 7278"),Html.fromHtml( "Ohms"),Html.fromHtml( "0.000 0029")),
//
                    new ListViewItem(R.drawable.star, "Josephson constant", Html.fromHtml("483 597.8525 x 10<sup><small>9</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> V<sup><small>-1</small></sup>"),Html.fromHtml( "0.0030 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Magnetic Flux Quantum", Html.fromHtml("2.067 833 831 x 10<sup><small>-15</small></sup>"), Html.fromHtml("Wb"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton",Html.fromHtml( "5.050 783 699 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 031 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in (eV)/T ", Html.fromHtml("3.152 451 2550 x 10<sup><small>-8</small></sup>"),Html.fromHtml( "<sup>(eV)</sip>/<sub>T</sub>"),Html.fromHtml( "0.000 000 0015 x 10<sup><small>-8</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in inverse meters per tesla", Html.fromHtml("2.542 623 432 x 10<sup><small>-2</small></sup>"),Html.fromHtml( "m<sup><small>-1</small></sup> <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 000 016 x 10<sup><small>-2</small></sup>")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in K/T", Html.fromHtml("3.658 2690 x 10<sup><small>-4</small></sup>"),Html.fromHtml("K <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0021")),
                    new ListViewItem(R.drawable.star, "Nuclear Magneton in MHz/T ", Html.fromHtml("7.622 593 285"), Html.fromHtml("MHz <sup><small>.</small></sup> T<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 047")),
                    new ListViewItem(R.drawable.star, "Von Klitzing constant", Html.fromHtml("25 812.807 4555"),Html.fromHtml( "Ohm"),Html.fromHtml( "0.000 0059")),

                    new ListViewItem(R.drawable.star, "Atomic Mass Constant ", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 020 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Avogadro Constant", Html.fromHtml("6.022 140 857 x 10<sup><small>23</small></sup>"),Html.fromHtml(" mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 074 x 10<sup><small>23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Boltzmann Constant", Html.fromHtml("1.380 648 52 x 10<sup><small>-23</small></sup>"), Html.fromHtml("K<sup><small>-1</small></sup>"), Html.fromHtml("0.000 000 79 x 10<sup><small>-23</small></sup>")),
                    new ListViewItem(R.drawable.star, "Conductance Quantum", Html.fromHtml("7.748 091 7310 x 10<sup><small>-5</small></sup>"), Html.fromHtml("s"),Html.fromHtml("0.000 000 0018 x 10<sup><small>-5</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electric Constant", Html.fromHtml("8.854 187 817... x 10<sup><small>-12</small></sup>"), Html.fromHtml("F m<sup><small>-1</small></sup>"), Html.fromHtml("(exact)")),

                    new ListViewItem(R.drawable.star, "Electron mass", Html.fromHtml("9.109 383 56 x 10<sup><small>-31</small></sup>"), Html.fromHtml("kg"), Html.fromHtml("0.000 000 11 x 10<sup><small>-31</small></sup>")),
                    new ListViewItem(R.drawable.star, "Electron volt", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"),Html.fromHtml(" J"), Html.fromHtml("0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Elementary charge ", Html.fromHtml("1.602 176 6208 x 10<sup><small>-19</small></sup>"), Html.fromHtml("C"), Html.fromHtml("0.000 000 0098 x 10<sup><small>-19</small></sup>")),
                    new ListViewItem(R.drawable.star, "Faraday constant ", Html.fromHtml("96 485.332 89 x 10<sup><small>-5</small></sup>"), Html.fromHtml("C <sup><small>.</small></sup> mol<sup><small>-1</small></sup>"), Html.fromHtml("0.000 59")),
                    new ListViewItem(R.drawable.star, "Fine-structure constant ", Html.fromHtml("7.297 352 5664 x 10<sup><small>-3</small></sup>"), Html.fromHtml("(none)  "), Html.fromHtml("0.000 000 0017 x 10<sup><small>-3</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Inverse fine-structure constant", Html.fromHtml("137.035 999 139"),Html.fromHtml( "  "),Html.fromHtml( "0.000 000 031")),
                    new ListViewItem(R.drawable.star, "Magnetic constant", Html.fromHtml("4pi e-7 = 12.566 370 614... x 10<sup><small>-7</small></sup>"),Html.fromHtml(" N <sup><small>.</small></sup> A<sup><small>-2</small></sup>"),Html.fromHtml( "(exact)")),
                    new ListViewItem(R.drawable.star, "Magnetic Flux Quantum", Html.fromHtml("2.067 833 831 x 10<sup><small>-15</small></sup>"),Html.fromHtml( "Wb"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-15</small></sup>")),
                    new ListViewItem(R.drawable.star, "Molar Gas constant", Html.fromHtml("8.314 4598"),Html.fromHtml( "J mol<sup><small>-1</small></sup> <sup><small>.</small></sup> K<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0048")),
                    new ListViewItem(R.drawable.star, "Newtonian constant of gravitation ", Html.fromHtml("6.674 08 x 10<sup><small>-11</small></sup>"),Html.fromHtml( "m<sup><small>3</small></sup> <sup><small>.</small></sup> kg<sup><small>-1</small></sup> <sup><small>.</small></sup> s<sup><small>-2</small></sup>"),Html.fromHtml( "0.000 31 x 10<sup><small>-11</small></sup>")),
//
                    new ListViewItem(R.drawable.star, "Planck constant", Html.fromHtml("6.626 070 040x 10<sup><small>-34</small></sup>"), Html.fromHtml("J <sup><small>.</small></sup> s"), Html.fromHtml("0.000 000 081 x 10<sup><small>-34</small></sup>")),
                    new ListViewItem(R.drawable.star, "Planck constant over 2 pi", Html.fromHtml("1.054 571 800x 10<sup><small>-34</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> s"),Html.fromHtml( "0.000 000 013 x 10<sup><small>-34</small></sup>")),
                    new ListViewItem(R.drawable.star, "Proton Mass", Html.fromHtml("1.672 621 898 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 021 x 10<sup><small>-27</small></sup>")),
                    new ListViewItem(R.drawable.star, "Proton-Electron Mass Ratio", Html.fromHtml("1836.152 673 89"), Html.fromHtml("(none) "), Html.fromHtml("0.000 000 17")),
                    new ListViewItem(R.drawable.star, "Rydberg constant", Html.fromHtml("10 973 731.568 508"), Html.fromHtml("m<sup><small>-1</small></sup>"), Html.fromHtml("0.000 065")),

                    new ListViewItem(R.drawable.star, "Speed of Light in Vacuum", Html.fromHtml("299 792 458"), Html.fromHtml("m <sup><small>.</small></sup> s<sup><small>-1</small></sup>"), Html.fromHtml("(exact)")),
                    new ListViewItem(R.drawable.star, "Stefan-Boltzmann constant", Html.fromHtml("5.670 367 x 10<sup><small>-8</small></sup>"), Html.fromHtml("Wm<sup><small>-2</small></sup> <sup><small>.</small></sup> K<sup><small>-4</small></sup>"),Html.fromHtml( "0.000 013 x 10<sup><small>-8</small></sup>")),

                    new ListViewItem(R.drawable.star, "Bohr Radius", Html.fromHtml("0.529 177 210 67 x 10<sup><small>-10</small></sup>"),Html.fromHtml( "m"),Html.fromHtml( "0.000 000 000 12 x 10<sup><small>-10</small></sup>")),
                    new ListViewItem(R.drawable.star, "Bohr Magneton ", Html.fromHtml("927.400 9994 x 10<sup><small>-26</small></sup>"),Html.fromHtml(" J <sup><small>.</small></sup> T<sup><small>-1</small></sup>"),Html.fromHtml( "0.000 0057 x 10<sup><small>-26</small></sup>")),
                    new ListViewItem(R.drawable.star, "Josephson constant", Html.fromHtml("483 597.8525 x 10<sup><small>9</small></sup>"),Html.fromHtml( "Hz <sup><small>.</small></sup> V<sup><small>-1</small></sup>"),Html.fromHtml( "0.0030 x 10<sup><small>9</small></sup>")),
                    new ListViewItem(R.drawable.star, "Von Klitzing constant", Html.fromHtml("25 812.807 4555"), Html.fromHtml("Ohm"),Html.fromHtml( "0.000 0059")),
                    new ListViewItem(R.drawable.star, "Unified Atomic Mass Unit", Html.fromHtml("1.660 539 040 x 10<sup><small>-27</small></sup>"),Html.fromHtml( "kg"),Html.fromHtml( "0.000 000 020 x 10<sup><small>-27</small></sup>"))

            };



    HashMap<String,ListViewItem> allMap = new HashMap<String, ListViewItem>();





//enters all data in common array into the common HashMap
    public void putInCommonMap(){
        for(ListViewItem i : constant_common_data) commonMap.put(i.getKey(),i);
    }

    public void putInElectromagneticMap(){
        for(ListViewItem i : constant_electromagnetic_data) electromagneticMap.put(i.getKey(),i);
    }

    public void putInChemMap(){
        for(ListViewItem i : constant_chemical_data) chemMap.put(i.getKey(),i);
    }

    public void putInNucMap(){
        for(ListViewItem i : constant_atomic_data) atomicMap.put(i.getKey(),i);
    }

    public void putInAllMap(){
        for(ListViewItem i : all_data) allMap.put(i.getKey(),i);
    }
    //returns common hashmap
    public HashMap getCommonMap(){
        return commonMap;
    }

    //returns chem hashmap
    public HashMap getChemMap(){
        return chemMap;
    }

    //returns atomic/nuclear hashmap
    public HashMap getAtomicMap(){
        return atomicMap;
    }


    //returns electromagnetic hashmap
    public HashMap getElectromagneticMap(){
        return electromagneticMap;
    }

    //returns hashmap with all constants in it
    public HashMap getAllMap(){
        return allMap;
    }
}
