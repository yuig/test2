package td;

import com.bumptech.glide.Registry$MissingComponentException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: e */
    public static final wc.b f117398e = new wc.b(8);

    /* renamed from: f */
    public static final i f117399f = new i(1);

    /* renamed from: a */
    public final ArrayList f117400a;

    /* renamed from: b */
    public final wc.b f117401b;

    /* renamed from: c */
    public final HashSet f117402c;

    /* renamed from: d */
    public final p5.d f117403d;

    public i0(x92.b bVar) {
        wc.b bVar2 = f117398e;
        this.f117400a = new ArrayList();
        this.f117402c = new HashSet();
        this.f117403d = bVar;
        this.f117401b = bVar2;
    }

    public final synchronized void a(Class cls, Class cls2, d0 d0Var) {
        h0 h0Var = new h0(cls, cls2, d0Var);
        ArrayList arrayList = this.f117400a;
        arrayList.add(arrayList.size(), h0Var);
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f117400a.iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) it.next();
                if (!this.f117402c.contains(h0Var) && h0Var.f117394a.isAssignableFrom(cls)) {
                    this.f117402c.add(h0Var);
                    arrayList.add(h0Var.f117396c.a(this));
                    this.f117402c.remove(h0Var);
                }
            }
        } catch (Throwable th3) {
            this.f117402c.clear();
            throw th3;
        }
        return arrayList;
    }

    public final synchronized c0 c(final Class cls, final Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f117400a.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                h0 h0Var = (h0) it.next();
                if (this.f117402c.contains(h0Var)) {
                    z13 = true;
                } else if (h0Var.f117394a.isAssignableFrom(cls) && h0Var.f117395b.isAssignableFrom(cls2)) {
                    this.f117402c.add(h0Var);
                    arrayList.add(d(h0Var));
                    this.f117402c.remove(h0Var);
                }
            }
            if (arrayList.size() > 1) {
                wc.b bVar = this.f117401b;
                p5.d dVar = this.f117403d;
                bVar.getClass();
                return new g0(arrayList, dVar);
            }
            if (arrayList.size() == 1) {
                return (c0) arrayList.get(0);
            }
            if (!z13) {
                throw new Registry$MissingComponentException(cls, cls2) { // from class: com.bumptech.glide.Registry$NoModelLoaderAvailableException
                    {
                        super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
                    }
                };
            }
            return f117399f;
        } catch (Throwable th3) {
            this.f117402c.clear();
            throw th3;
        }
    }

    public final c0 d(h0 h0Var) {
        return h0Var.f117396c.a(this);
    }

    public final synchronized ArrayList e(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f117400a.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (!arrayList.contains(h0Var.f117395b) && h0Var.f117394a.isAssignableFrom(cls)) {
                arrayList.add(h0Var.f117395b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList f() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f117400a.iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            if (h0Var.f117394a.isAssignableFrom(t.class) && h0Var.f117395b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(h0Var.f117396c);
            }
        }
        return arrayList;
    }
}
