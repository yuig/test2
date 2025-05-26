package ne;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: d */
    public static final CopyOnWriteArraySet f90435d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final String f90436a;

    /* renamed from: b */
    public final String f90437b;

    /* renamed from: c */
    public final List f90438c;

    public c(String str, List list, String str2) {
        this.f90436a = str;
        this.f90437b = str2;
        this.f90438c = list;
    }

    public static final /* synthetic */ CopyOnWriteArraySet a() {
        if (p001if.a.b(c.class)) {
            return null;
        }
        try {
            return f90435d;
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
            return null;
        }
    }

    public final ArrayList b() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            return new ArrayList(this.f90438c);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }

    public final String c() {
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            return this.f90436a;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
