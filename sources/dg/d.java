package dg;

import a.cb;
import bg.l;
import cg.j;
import com.github.mustachejava.MustacheException;
import com.github.mustachejava.util.GuardException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: g, reason: collision with root package name */
    public static final gg.d[] f54902g = new gg.d[0];

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f54903h = Logger.getLogger("mustache");

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f54904i = Boolean.getBoolean("mustache.debug");

    /* renamed from: a, reason: collision with root package name */
    public final ve.h f54905a;

    /* renamed from: b, reason: collision with root package name */
    public final l f54906b;

    /* renamed from: c, reason: collision with root package name */
    public final String f54907c;

    /* renamed from: d, reason: collision with root package name */
    public final bg.a f54908d;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f54909e = new CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public volatile gg.d[] f54910f;

    public d(g gVar, String str, l lVar, bg.a aVar) {
        this.f54907c = str;
        this.f54908d = aVar;
        this.f54905a = gVar;
        this.f54906b = lVar;
    }

    public static void b(String str, List list, l lVar) {
        StringBuilder o13 = cb.o("Failed to find: ", str, " (");
        o13.append(lVar.f22777c);
        o13.append(":");
        o13.append(lVar.f22778d);
        o13.append(") in");
        int i13 = 0;
        list.stream().filter(new b(i13)).forEach(new c(o13, i13));
        f54903h.warning(o13.toString());
    }

    public final Object a(List list) {
        e l13;
        gg.d[] dVarArr = this.f54910f;
        if (dVarArr != null) {
            for (gg.d dVar : dVarArr) {
                try {
                    ve.h hVar = this.f54905a;
                    Object a13 = dVar.a(list);
                    hVar.getClass();
                    return ve.h.c(a13);
                } catch (MustacheException e13) {
                    throw new MustacheException("Failed: " + dVar, e13, this.f54906b);
                } catch (GuardException unused) {
                }
            }
        }
        String str = this.f54907c;
        synchronized (this) {
            l13 = this.f54905a.l(str, list);
            if ((l13 instanceof f) && f54904i && !(this.f54908d instanceof j)) {
                b(str, list, this.f54906b);
            }
        }
        this.f54909e.add(l13);
        if (this.f54910f == null || this.f54910f.length != this.f54909e.size()) {
            this.f54910f = (gg.d[]) this.f54909e.toArray(f54902g);
        }
        try {
            ve.h hVar2 = this.f54905a;
            Object a14 = l13.a(list);
            hVar2.getClass();
            return ve.h.c(a14);
        } catch (GuardException unused2) {
            throw new GuardException("BUG: Unexpected guard failure: " + this.f54907c + " " + this.f54909e + " " + Collections.singletonList(list));
        }
    }
}
