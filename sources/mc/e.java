package mc;

import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f86887a;

    /* renamed from: b, reason: collision with root package name */
    public String f86888b;

    /* renamed from: c, reason: collision with root package name */
    public String f86889c;

    /* renamed from: d, reason: collision with root package name */
    public long f86890d;

    /* renamed from: e, reason: collision with root package name */
    public long f86891e;

    /* renamed from: f, reason: collision with root package name */
    public long f86892f;

    /* renamed from: g, reason: collision with root package name */
    public Map f86893g;

    public e(String str, a aVar) {
        this.f86888b = str;
        this.f86887a = aVar.f86879a.length;
        this.f86889c = aVar.f86880b;
        this.f86890d = aVar.f86881c;
        this.f86891e = aVar.f86882d;
        this.f86892f = aVar.f86883e;
        this.f86893g = aVar.f86884f;
    }

    public static e a(FilterInputStream filterInputStream) {
        e eVar = new e();
        if (g.h(filterInputStream) != 538183203) {
            throw new IOException();
        }
        eVar.f86888b = g.j(filterInputStream);
        String j13 = g.j(filterInputStream);
        eVar.f86889c = j13;
        if (j13.equals("")) {
            eVar.f86889c = null;
        }
        eVar.f86890d = g.i(filterInputStream);
        eVar.f86891e = g.i(filterInputStream);
        eVar.f86892f = g.i(filterInputStream);
        int h10 = g.h(filterInputStream);
        Map emptyMap = h10 == 0 ? Collections.emptyMap() : new HashMap(h10);
        for (int i13 = 0; i13 < h10; i13++) {
            emptyMap.put(g.j(filterInputStream).intern(), g.j(filterInputStream).intern());
        }
        eVar.f86893g = emptyMap;
        return eVar;
    }

    public final a b(byte[] bArr) {
        a aVar = new a();
        aVar.f86879a = bArr;
        aVar.f86880b = this.f86889c;
        aVar.f86881c = this.f86890d;
        aVar.f86882d = this.f86891e;
        aVar.f86883e = this.f86892f;
        aVar.f86884f = this.f86893g;
        return aVar;
    }

    public final boolean c(FileOutputStream fileOutputStream) {
        try {
            g.m(fileOutputStream, 538183203);
            g.o(fileOutputStream, this.f86888b);
            String str = this.f86889c;
            if (str == null) {
                str = "";
            }
            g.o(fileOutputStream, str);
            g.n(fileOutputStream, this.f86890d);
            g.n(fileOutputStream, this.f86891e);
            g.n(fileOutputStream, this.f86892f);
            Map map = this.f86893g;
            if (map != null) {
                g.m(fileOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    g.o(fileOutputStream, (String) entry.getKey());
                    g.o(fileOutputStream, (String) entry.getValue());
                }
            } else {
                g.m(fileOutputStream, 0);
            }
            fileOutputStream.flush();
            return true;
        } catch (IOException e13) {
            e13.toString();
            return false;
        }
    }
}
