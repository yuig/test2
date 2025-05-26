package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.p7;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class u1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18146a;

    /* renamed from: b, reason: collision with root package name */
    public int f18147b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18148c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f18149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f18150e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(p7 p7Var) {
        this(p7Var, 1);
        this.f18146a = 1;
    }

    public final Iterator b() {
        int i13 = this.f18146a;
        AbstractMap abstractMap = this.f18150e;
        switch (i13) {
            case 0:
                if (this.f18149d == null) {
                    this.f18149d = ((p1) abstractMap).f18125c.entrySet().iterator();
                }
                return this.f18149d;
            case 1:
            default:
                if (this.f18149d == null) {
                    this.f18149d = ((com.google.protobuf.f2) abstractMap).f33888c.entrySet().iterator();
                }
                return this.f18149d;
            case 2:
                if (this.f18149d != null) {
                    return this.f18149d;
                }
                ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).getClass();
                throw null;
        }
    }

    public final Map.Entry c() {
        int i13 = this.f18146a;
        AbstractMap abstractMap = this.f18150e;
        switch (i13) {
            case 0:
                this.f18148c = true;
                int i14 = this.f18147b + 1;
                this.f18147b = i14;
                p1 p1Var = (p1) abstractMap;
                return i14 < p1Var.f18124b.size() ? (Map.Entry) p1Var.f18124b.get(this.f18147b) : (Map.Entry) b().next();
            case 1:
            default:
                this.f18148c = true;
                int i15 = this.f18147b + 1;
                this.f18147b = i15;
                com.google.protobuf.f2 f2Var = (com.google.protobuf.f2) abstractMap;
                return i15 < f2Var.f33887b.size() ? (Map.Entry) f2Var.f33887b.get(this.f18147b) : (Map.Entry) b().next();
            case 2:
                this.f18148c = true;
                this.f18147b++;
                ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).getClass();
                throw null;
        }
    }

    public final Iterator d() {
        if (this.f18149d != null) {
            return this.f18149d;
        }
        ((p7) this.f18150e).getClass();
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i13 = this.f18146a;
        AbstractMap abstractMap = this.f18150e;
        switch (i13) {
            case 0:
                p1 p1Var = (p1) abstractMap;
                return this.f18147b + 1 < p1Var.f18124b.size() || (!p1Var.f18125c.isEmpty() && b().hasNext());
            case 1:
                ((p7) abstractMap).getClass();
                throw null;
            case 2:
                ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).getClass();
                throw null;
            default:
                com.google.protobuf.f2 f2Var = (com.google.protobuf.f2) abstractMap;
                return this.f18147b + 1 < f2Var.f33887b.size() || (!f2Var.f33888c.isEmpty() && b().hasNext());
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f18146a) {
            case 0:
                return c();
            case 1:
                this.f18148c = true;
                this.f18147b++;
                ((p7) this.f18150e).getClass();
                throw null;
            case 2:
                return c();
            default:
                return c();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i13 = this.f18146a;
        AbstractMap abstractMap = this.f18150e;
        switch (i13) {
            case 0:
                if (!this.f18148c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18148c = false;
                p1 p1Var = (p1) abstractMap;
                int i14 = p1.f18122g;
                p1Var.b();
                if (this.f18147b >= p1Var.f18124b.size()) {
                    b().remove();
                    return;
                }
                int i15 = this.f18147b;
                this.f18147b = i15 - 1;
                p1Var.o(i15);
                return;
            case 1:
                if (!this.f18148c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18148c = false;
                p7 p7Var = (p7) abstractMap;
                int i16 = p7.f31584a;
                p7Var.g();
                p7Var.getClass();
                throw null;
            case 2:
                if (!this.f18148c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18148c = false;
                com.google.crypto.tink.shaded.protobuf.s1 s1Var = (com.google.crypto.tink.shaded.protobuf.s1) abstractMap;
                int i17 = com.google.crypto.tink.shaded.protobuf.s1.f33691a;
                s1Var.a();
                s1Var.getClass();
                throw null;
            default:
                if (!this.f18148c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f18148c = false;
                com.google.protobuf.f2 f2Var = (com.google.protobuf.f2) abstractMap;
                int i18 = com.google.protobuf.f2.f33885g;
                f2Var.b();
                if (this.f18147b >= f2Var.f33887b.size()) {
                    b().remove();
                    return;
                }
                int i19 = this.f18147b;
                this.f18147b = i19 - 1;
                f2Var.o(i19);
                return;
        }
    }

    public /* synthetic */ u1(AbstractMap abstractMap, int i13) {
        this.f18146a = i13;
        this.f18150e = abstractMap;
        this.f18147b = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(com.google.crypto.tink.shaded.protobuf.s1 s1Var) {
        this(s1Var, 2);
        this.f18146a = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(com.google.protobuf.f2 f2Var) {
        this(f2Var, 3);
        this.f18146a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(p1 p1Var) {
        this(p1Var, 0);
        this.f18146a = 0;
    }
}
