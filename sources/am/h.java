package am;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f15515a;

    public h(Context context, String str) {
        this.f15515a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j13 = this.f15515a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f15515a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f15515a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f15515a.edit().putStringSet(str, hashSet).putLong("fire-count", j13 - 1).commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f15515a.edit();
            int i13 = 0;
            for (Map.Entry<String, ?> entry : this.f15515a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d2 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i13++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i13 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i13);
            }
            edit.commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f15515a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f15515a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    public final synchronized String d(long j13) {
        return new Date(j13).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f15515a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void f() {
        String d2 = d(System.currentTimeMillis());
        this.f15515a.edit().putString("last-used-date", d2).commit();
        g(d2);
    }

    public final synchronized void g(String str) {
        try {
            String e13 = e(str);
            if (e13 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f15515a.getStringSet(e13, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f15515a.edit().remove(e13).commit();
            } else {
                this.f15515a.edit().putStringSet(e13, hashSet).commit();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean h(long j13) {
        if (!this.f15515a.contains("fire-global")) {
            this.f15515a.edit().putLong("fire-global", j13).commit();
            return true;
        }
        long j14 = this.f15515a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j14).equals(d(j13))) {
                return false;
            }
            this.f15515a.edit().putLong("fire-global", j13).commit();
            return true;
        }
    }

    public final synchronized void i(long j13, String str) {
        String d2 = d(j13);
        if (this.f15515a.getString("last-used-date", "").equals(d2)) {
            String e13 = e(d2);
            if (e13 == null) {
                return;
            }
            if (e13.equals(str)) {
                return;
            }
            j(str, d2);
            return;
        }
        long j14 = this.f15515a.getLong("fire-count", 0L);
        if (j14 + 1 == 30) {
            a();
            j14 = this.f15515a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f15515a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.f15515a.edit().putStringSet(str, hashSet).putLong("fire-count", j14 + 1).putString("last-used-date", d2).commit();
    }

    public final synchronized void j(String str, String str2) {
        g(str2);
        HashSet hashSet = new HashSet(this.f15515a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f15515a.edit().putStringSet(str, hashSet).commit();
    }
}
