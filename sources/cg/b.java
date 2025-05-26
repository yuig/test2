package cg;

import com.github.mustachejava.MustacheException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes3.dex */
public class b implements bg.a, Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public String f27667a;

    /* renamed from: b, reason: collision with root package name */
    public c f27668b;

    /* renamed from: c, reason: collision with root package name */
    public final ve.h f27669c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27670d;

    /* renamed from: e, reason: collision with root package name */
    public final bg.l f27671e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27672f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27673g;

    /* renamed from: h, reason: collision with root package name */
    public final dg.d f27674h;

    /* renamed from: i, reason: collision with root package name */
    public final bg.d f27675i;

    public b() {
        this(null, null, null, null, null);
    }

    @Override // bg.a
    public synchronized void a() {
        k();
        bg.a[] g13 = g();
        if (g13 != null) {
            for (bg.a aVar : g13) {
                aVar.a();
            }
        }
    }

    @Override // bg.a
    public Writer b(Writer writer, List list) {
        Writer m13 = m(writer, list);
        i(m13);
        return m13;
    }

    @Override // bg.a
    public void c(bg.a[] aVarArr) {
        this.f27668b.f27676j = aVarArr;
    }

    public final Object clone() {
        HashSet hashSet = new HashSet();
        hashSet.add(this);
        return j(hashSet);
    }

    @Override // bg.a
    public bg.a[] g() {
        c cVar = this.f27668b;
        if (cVar == null) {
            return null;
        }
        return cVar.f27676j;
    }

    @Override // bg.a
    public void h(StringWriter stringWriter) {
        try {
            if (this.f27670d != null) {
                o(stringWriter, this.f27672f);
                if (g() != null) {
                    n(stringWriter);
                    o(stringWriter, "/");
                }
            }
            i(stringWriter);
        } catch (IOException e13) {
            throw new MustacheException("Failed to write", e13, this.f27671e);
        }
    }

    public final void i(Writer writer) {
        String str = this.f27667a;
        if (str != null) {
            try {
                writer.write(str);
            } catch (IOException e13) {
                throw new MustacheException("Failed to write", e13, this.f27671e);
            }
        }
    }

    public final b j(HashSet hashSet) {
        try {
            b bVar = (b) super.clone();
            bg.a[] g13 = bVar.g();
            if (g13 != null) {
                bg.a[] aVarArr = (bg.a[]) g13.clone();
                for (int i13 = 0; i13 < aVarArr.length; i13++) {
                    if (!hashSet.add(aVarArr[i13])) {
                        b j13 = ((b) aVarArr[i13]).j(hashSet);
                        aVarArr[i13] = j13;
                        hashSet.remove(j13);
                    }
                }
                bVar.c(aVarArr);
            }
            c cVar = this.f27668b;
            if (cVar != null && !hashSet.add(cVar)) {
                bVar.f27668b = (c) this.f27668b.j(hashSet);
                hashSet.remove(this.f27668b);
            }
            return bVar;
        } catch (CloneNotSupportedException e13) {
            throw new MustacheException("Clone not supported", e13, this.f27671e);
        }
    }

    public final void k() {
        String str;
        bg.d dVar = this.f27675i;
        if (dVar == null || (str = this.f27667a) == null) {
            return;
        }
        boolean z13 = this.f27671e.f22779e;
        dVar.getClass();
        this.f27667a = str;
    }

    public final Object l(List list) {
        bg.l lVar = this.f27671e;
        if (this.f27673g) {
            int size = list == null ? 0 : list.size();
            if (size == 0) {
                return null;
            }
            return list.get(size - 1);
        }
        try {
            return this.f27674h.a(list);
        } catch (MustacheException e13) {
            if (e13.f30177a == null) {
                e13.f30177a = lVar;
            }
            throw e13;
        } catch (Throwable th3) {
            throw new MustacheException(th3.getMessage(), th3, lVar);
        }
    }

    public Writer m(Writer writer, List list) {
        c cVar = this.f27668b;
        return cVar == null ? writer : cVar.m(writer, list);
    }

    public final void n(StringWriter stringWriter) {
        int length = g().length;
        for (int i13 = 0; i13 < length; i13++) {
            g()[i13].h(stringWriter);
        }
    }

    public final void o(StringWriter stringWriter, String str) {
        bg.l lVar = this.f27671e;
        stringWriter.write(lVar.f22775a);
        stringWriter.write(str);
        stringWriter.write(this.f27670d);
        stringWriter.write(lVar.f22776b);
    }

    public b(bg.l lVar, bg.d dVar, c cVar, String str, String str2) {
        this.f27675i = dVar;
        ve.h hVar = dVar == null ? null : (ve.h) dVar.f22760d;
        this.f27669c = hVar;
        this.f27668b = cVar;
        this.f27672f = str2;
        this.f27670d = str;
        this.f27671e = lVar;
        this.f27674h = hVar != null ? new dg.d((dg.g) hVar, str, lVar, this) : null;
        this.f27673g = ".".equals(str);
    }
}
