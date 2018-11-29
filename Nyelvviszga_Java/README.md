# Nyelvizsga

A feladat során Az OKTATÁSI HIVATAL Nyelvvizsgáztatási Akkreditációs Központ (www.nyak.hu) nyelvvizsga statisztikáival kell dolgoznia. Az adatokat két UTF-8 kódolású állomány tartalmazza: *sikeres.csv* és *sikertelen.csv*. A fájlok egy-egy sora — pontosvesszővel elválasztva — tartalmazza, hogy egy nyelvből az utóbbi 9 évben (2009-2017) hányan tettek vizsgát. A *sikeres.csv* állományban a sikeres vizsgák száma található meg, a *sikertelen.csv* állományban a sikertelen vizsgák száma szerepel.


```TXT
    Nyelv;2009;2010;2011;2012;2013;2014;2015;2016;2017
    angol;70961;70485;69553;62613;56619;56917;63467;61919;48503
    arab;10;20;17;11;11;8;9;23;19
    bolgár;6;0;0;0;0;0;1;2;1
    cigány (beás);69;57;33;17;18;20;13;18;11
    cigány (lovári);751;662;513;443;334;374;504;710;801
    cseh;9;17;4;15;13;7;7;4;0
    dán;14;11;9;8;9;10;16;12;5
    eszperantó;2332;2310;2028;1808;1574;1447;1212;1301;696
    finn;43;56;43;34;22;24;18;24;22
```


**A két fájlban a sorok száma, a nyelvek és az évek sorrendje megegyezik. Mindkét fájlban van fejléc sor, ami a mezők jelentését írja le.**

*A megoldás során vegye figyelembe a következőket:*

* Az ékezetmentes kiírás is elfogadott.
* A feladat jobb megértése érdekében tanulmányozza a mintákat is!

Készítsen konzolos vagy grafikus programot **Nyelvvizsga** néven, amely az alábbi feladatokat oldja meg!

1. Tárolja el a fájlok tartalmát olyan adatszerkezetben, amellyel a további feladatok megoldhatók!

2.	Határozza meg és írja ki a képernyőre, hogy a kilenc év sikeres és sikertelen vizsgáit összegezve melyik 3 nyelv volt a legnépszerűbb! A kiírás során a nyelvek népszerűségi sorrendben jelenjenek meg! (Feltételezheti, hogy nem alakult ki holtverseny.)

3.	Kérjen be a felhasználótól egy évet! Ellenőrizze, hogy a bekért év 2009 és 2017 között van! A program futása csak akkor folytatódjon, ha a felhasználó helyes értéket ad meg. (Feltételezheti, hogy a felhasználó számot ad meg.)

4.	Határozza meg, hogy a 3. feladat során bekért évben melyik volt az a nyelv, amely esetében a legnagyobb volt a sikertelen vizsgák aránya! (Az arány meghatározásánál vegye figyelembe a sikertelen és az összes vizsga számát!) A nyelv mellett — két tizedesjegy pontossággal — írja ki azt is, hogy mekkora volt a sikertelen vizsgák aránya! Ha a 3. feladatot nem tudta megoldani, akkor a 2014-es évvel számoljon!

5.	Írja ki a képernyőre azon nyelveket, amelyekből a 3. feladatban megadott évben nem volt egyetlen vizsgázó sem. Ha nem volt ilyen nyelv, akkor írja ki, hogy „Minden nyelvből volt vizsgázó” Ha a 3. feladatot nem tudta megoldani, akkor a 2014-es évvel számoljon!

6. Készítsen összesítést az adatokból, amelynek eredményét mentse **osszesites.csv** állományba! Az állomány minden sora — pontosvesszővel elválasztva — tartalmazza a nyelvet, a kilenc év alatti összes vizsga számát és a sikeres vizsgák arányát két tizedesjegyre kerekítve! 

##Minta  

```TXT
2. feladat: 
    A legnépszerűbb nyelvek: angol, német, eszperantó 
3. feladat: 
    Vizsgálandó év: 2014 
4. feladat: 
    2014-ben kínai nyelvből a sikertelen vizsgák aránya 66.67%
5. feladat:
    bolgár 
    ógörög
    ruszin 
```

**osszesites.csv** minta:

```TXT
    angol;877911;63.91% 
    arab;167;76.65% 
    bolgár;17;58.82% 
    cigány (beás);374;68.45% 
    cigány (lovári);13440;37.89% 
    cseh;88;86.36% 
    dán;124;75.81% 
    eszperantó;34818;42.24% 
    finn;346;82.66% 
```
