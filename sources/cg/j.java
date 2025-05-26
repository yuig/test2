package cg;

import com.github.mustachejava.MustacheException;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* loaded from: classes3.dex */
public class j extends b {

    /* renamed from: j, reason: collision with root package name */
    public final String f27682j;

    /* renamed from: k, reason: collision with root package name */
    public final String f27683k;

    /* renamed from: l, reason: collision with root package name */
    public c f27684l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27685m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f27686n;

    public j(bg.l lVar, bg.d dVar, c cVar, String str, String str2) {
        super(lVar, dVar, cVar, str2, str);
        String str3 = lVar.f22777c;
        int lastIndexOf = str3.lastIndexOf(".");
        this.f27682j = lastIndexOf == -1 ? "" : str3.substring(lastIndexOf);
        this.f27683k = str3.substring(0, str3.lastIndexOf("/") + 1);
        this.f27685m = dVar.f22757a;
    }

    @Override // cg.b, bg.a
    public synchronized void a() {
        k();
        c c13 = this.f27675i.c(p());
        this.f27684l = c13;
        if (c13.f27678l) {
            this.f27686n = true;
        }
    }

    @Override // cg.b, bg.a
    public final Writer b(Writer writer, List list) {
        d dVar;
        Writer writer2;
        if (this.f27686n) {
            d dVar2 = writer instanceof d ? (d) writer : new d(writer);
            int incrementAndGet = dVar2.f27679a.incrementAndGet();
            int i13 = this.f27685m;
            if (incrementAndGet > i13) {
                throw new MustacheException(this.f27671e, a.a.d("Maximum partial recursion limit reached: ", i13));
            }
            dVar = dVar2;
            writer2 = dVar2;
        } else {
            dVar = null;
            writer2 = writer;
        }
        Writer b13 = this.f27684l.b(writer2, list);
        if (this.f27686n) {
            dVar.f27679a.decrementAndGet();
        }
        i(b13);
        return b13;
    }

    @Override // cg.b, bg.a
    public final void c(bg.a[] aVarArr) {
        this.f27684l.f27676j = aVarArr;
    }

    @Override // cg.b, bg.a
    public final bg.a[] g() {
        c cVar = this.f27684l;
        if (cVar == null) {
            return null;
        }
        return cVar.f27676j;
    }

    @Override // cg.b, bg.a
    public final void h(StringWriter stringWriter) {
        try {
            if (this.f27670d != null) {
                o(stringWriter, this.f27672f);
            }
            i(stringWriter);
        } catch (IOException e13) {
            throw new MustacheException(e13, this.f27671e);
        }
    }

    public final String p() {
        this.f27675i.getClass();
        String str = this.f27670d;
        String p13 = !str.startsWith("/") ? a.a.p(new StringBuilder(), this.f27683k, str) : str;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            str = str.substring(lastIndexOf);
        }
        String str2 = this.f27682j;
        if (!str.endsWith(str2) && !str.contains(".")) {
            p13 = a.a.C(p13, str2);
        }
        return new File(p13).getPath().replace('\\', '/');
    }
}
