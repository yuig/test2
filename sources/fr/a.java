package fr;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import df.j1;
import er.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ny1.x;
import pk.a0;
import tb0.g;
import tb0.h;
import tr1.b;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f62801a = ContactsContract.Contacts.CONTENT_URI;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f62802b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f62803c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f62804d;

    static {
        ArrayList arrayList = new ArrayList();
        f62802b = arrayList;
        arrayList.add("facebook.com");
        f62803c = new String[]{"_id", "photo_id", "display_name", "contact_id", "data1"};
        f62804d = new String[]{"_id", "photo_id", "display_name", "contact_id", "data1"};
    }

    public static void a() {
        HashSet hashSet = h.f117076w;
        g.f117075a.h("READ_CONTACTS permission denied.");
    }

    public static String b() {
        return a0.N(Locale.getDefault().getLanguage(), "ja") ? "phonetic_name IS NULL, phonetic_name COLLATE LOCALIZED ASC, display_name COLLATE LOCALIZED ASC" : "display_name COLLATE LOCALIZED ASC";
    }

    public static List c(int i13, Context context, String str) {
        Cursor cursor;
        String str2;
        List emptyList = Collections.emptyList();
        if (!x.f92714f.a(context)) {
            return emptyList;
        }
        String str3 = a0.b1(str, "'", "''") + "%";
        try {
            cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Email.CONTENT_URI, f62803c, j1.W("%s LIKE '%s' OR %s LIKE '%s' AND %s <> '' AND %s = 1", "display_name", str3, "display_name", a.a.j("% ", str3), "data1", "in_visible_group"), null, b() + " LIMIT " + i13);
        } catch (SecurityException unused) {
            a();
            cursor = null;
        }
        HashSet hashSet = new HashSet();
        if (cursor != null && cursor.moveToFirst()) {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            int columnIndex = cursor.getColumnIndex("display_name");
            int columnIndex2 = cursor.getColumnIndex("data1");
            int columnIndex3 = cursor.getColumnIndex("contact_id");
            int columnIndex4 = cursor.getColumnIndex("photo_id");
            while (!cursor.isAfterLast()) {
                String string = cursor.getString(columnIndex2);
                if (!a0.x0(string)) {
                    String[] split = string.split("<|>|\\s");
                    int length = split.length;
                    for (int i14 = 0; i14 < length; i14++) {
                        str2 = split[i14];
                        if (!a0.x0(str2) && b.c(str2)) {
                            break;
                        }
                    }
                }
                str2 = null;
                if (str2 != null) {
                    String[] split2 = str2.split("@");
                    if ((!f62802b.contains(split2[split2.length - 1])) && !hashSet.contains(str2)) {
                        String valueOf = String.valueOf(cursor.getLong(columnIndex3));
                        String string2 = cursor.getString(columnIndex);
                        TypeAheadItem typeAheadItem = new TypeAheadItem();
                        typeAheadItem.f35140a = valueOf;
                        typeAheadItem.f35142c = string2;
                        typeAheadItem.f35145f = c.EMAIL_CONTACT;
                        if (!a0.x0(cursor.getString(columnIndex4))) {
                            typeAheadItem.s(f62801a + "/" + valueOf + "/photo");
                        }
                        typeAheadItem.f35143d = str2;
                        arrayList.add(typeAheadItem);
                        hashSet.add(str2);
                    }
                }
                cursor.moveToNext();
            }
            emptyList = e(a0.b1(str, "'", "''").toLowerCase(), arrayList);
        }
        if (cursor != null) {
            cursor.close();
        }
        return emptyList;
    }

    public static List d(int i13, Context context, String str) {
        Cursor cursor;
        List emptyList = Collections.emptyList();
        if (!x.f92714f.a(context)) {
            return emptyList;
        }
        String str2 = a0.b1(str, "'", "''") + "%";
        try {
            cursor = context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, f62804d, j1.V("%s LIKE '%s' OR %s LIKE '%s' AND %s <> '' AND %s = 1", "display_name", str2, "display_name", a.a.j("% ", str2), "data1", "in_visible_group"), null, b() + " LIMIT " + i13);
        } catch (SecurityException unused) {
            a();
            cursor = null;
        }
        HashSet hashSet = new HashSet();
        if (cursor != null && cursor.moveToFirst()) {
            ArrayList arrayList = new ArrayList(cursor.getCount());
            int columnIndex = cursor.getColumnIndex("display_name");
            int columnIndex2 = cursor.getColumnIndex("data1");
            int columnIndex3 = cursor.getColumnIndex("contact_id");
            int columnIndex4 = cursor.getColumnIndex("photo_id");
            while (!cursor.isAfterLast()) {
                String string = cursor.getString(columnIndex2);
                if (string != null && !hashSet.contains(string)) {
                    String valueOf = String.valueOf(cursor.getLong(columnIndex3));
                    String string2 = cursor.getString(columnIndex);
                    TypeAheadItem typeAheadItem = new TypeAheadItem();
                    typeAheadItem.f35140a = valueOf;
                    typeAheadItem.f35142c = string2;
                    typeAheadItem.f35145f = c.PHONE_CONTACT;
                    if (!a0.x0(cursor.getString(columnIndex4))) {
                        typeAheadItem.s(f62801a + "/" + valueOf + "/photo");
                    }
                    typeAheadItem.f35143d = string;
                    HashSet hashSet2 = typeAheadItem.f35159t;
                    if (!hashSet2.contains(string)) {
                        typeAheadItem.f35157r.add(string);
                        hashSet2.add(string);
                    }
                    arrayList.add(typeAheadItem);
                    hashSet.add(string);
                }
                cursor.moveToNext();
            }
            emptyList = e(a0.b1(str, "'", "''").toLowerCase(), arrayList);
        }
        if (cursor != null) {
            cursor.close();
        }
        return emptyList;
    }

    public static ArrayList e(String str, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TypeAheadItem typeAheadItem = (TypeAheadItem) it.next();
            String n13 = typeAheadItem.n();
            int indexOf = n13.indexOf(32);
            if (indexOf > 0) {
                n13 = n13.substring(0, indexOf);
            }
            if (n13.toLowerCase().startsWith(str)) {
                arrayList2.add(typeAheadItem);
            } else {
                arrayList3.add(typeAheadItem);
            }
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    public static String f(Set set) {
        return set.toString().replace('[', '(').replace(']', ')');
    }
}
