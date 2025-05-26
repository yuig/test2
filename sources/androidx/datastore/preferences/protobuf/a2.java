package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.measurement.internal.zzbb;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class a2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18031a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18032b;

    /* renamed from: c, reason: collision with root package name */
    public Iterable f18033c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(zm2.g gVar, int i13) {
        this(gVar);
        this.f18031a = 6;
    }

    public final String b() {
        switch (this.f18031a) {
            case 0:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return (String) ((Iterator) this.f18032b).next();
    }

    public final zm2.z c() {
        zm2.z zVar;
        zm2.z zVar2 = (zm2.z) this.f18033c;
        if (zVar2 == null) {
            throw new NoSuchElementException();
        }
        while (true) {
            if (!((Stack) this.f18032b).isEmpty()) {
                zm2.g gVar = ((zm2.d0) ((Stack) this.f18032b).pop()).f142187d;
                while (gVar instanceof zm2.d0) {
                    zm2.d0 d0Var = (zm2.d0) gVar;
                    ((Stack) this.f18032b).push(d0Var);
                    gVar = d0Var.f142186c;
                }
                zVar = (zm2.z) gVar;
                if (zVar.f142259b.length != 0) {
                    break;
                }
            } else {
                zVar = null;
                break;
            }
        }
        this.f18033c = zVar;
        return zVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18031a) {
            case 6:
                if (((zm2.z) this.f18033c) != null) {
                }
                break;
        }
        return ((Iterator) this.f18032b).hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f18031a) {
            case 0:
                return b();
            case 1:
                return (String) ((Iterator) this.f18032b).next();
            case 2:
                return (String) ((Iterator) this.f18032b).next();
            case 3:
                return (String) ((Iterator) this.f18032b).next();
            case 4:
                return b();
            case 5:
                return b();
            case 6:
                return c();
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18031a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException("Remove not supported");
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public a2(com.google.android.gms.internal.recaptcha.d1 d1Var) {
        this.f18031a = 2;
        this.f18033c = d1Var;
        this.f18032b = d1Var.f31747a.iterator();
    }

    public a2(s7 s7Var) {
        this.f18031a = 1;
        this.f18033c = s7Var;
        this.f18032b = s7Var.f31638a.iterator();
    }

    public a2(zzbb zzbbVar) {
        this.f18031a = 3;
        this.f18033c = zzbbVar;
        this.f18032b = zzbbVar.f32029f.keySet().iterator();
    }

    public a2(com.google.crypto.tink.shaded.protobuf.y1 y1Var) {
        this.f18031a = 4;
        this.f18033c = y1Var;
        this.f18032b = y1Var.f33714a.iterator();
    }

    public a2(zm2.k0 k0Var) {
        this.f18031a = 7;
        this.f18033c = k0Var;
        this.f18032b = k0Var.f142234a.iterator();
    }

    public a2(b2 b2Var) {
        this.f18031a = 0;
        this.f18033c = b2Var;
        this.f18032b = b2Var.f18034a.iterator();
    }

    public a2(com.google.protobuf.l2 l2Var) {
        this.f18031a = 5;
        this.f18033c = l2Var;
        this.f18032b = l2Var.f33926a.iterator();
    }

    public a2(zm2.g gVar) {
        this.f18031a = 6;
        this.f18032b = new Stack();
        while (gVar instanceof zm2.d0) {
            zm2.d0 d0Var = (zm2.d0) gVar;
            ((Stack) this.f18032b).push(d0Var);
            gVar = d0Var.f142186c;
        }
        this.f18033c = (zm2.z) gVar;
    }
}
