package m7;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86138a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f86139b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f86140c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86141d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f86142e;

    public c2(Context context, Looper looper, d7.e eVar, int i13) {
        this.f86138a = i13;
        if (i13 != 1) {
            this.f86142e = new tb.c(context.getApplicationContext());
            this.f86139b = ((d7.g0) eVar).a(looper, null);
        } else {
            this.f86142e = new tb.e(context.getApplicationContext());
            this.f86139b = ((d7.g0) eVar).a(looper, null);
        }
    }

    public final void a() {
        final int i13 = 0;
        int i14 = this.f86138a;
        Object obj = this.f86139b;
        switch (i14) {
            case 0:
                if (this.f86140c) {
                    this.f86140c = false;
                    final boolean z13 = this.f86141d;
                    ((d7.i0) ((d7.o) obj)).d(new Runnable() { // from class: m7.b2

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f86111b = false;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i15 = i13;
                            boolean z14 = z13;
                            boolean z15 = this.f86111b;
                            c2 c2Var = (c2) this;
                            switch (i15) {
                                case 0:
                                    int i16 = c2Var.f86138a;
                                    Object obj2 = c2Var.f86142e;
                                    switch (i16) {
                                        case 0:
                                            ((tb.c) obj2).o(z15, z14);
                                            break;
                                        default:
                                            ((tb.e) obj2).m(z15, z14);
                                            break;
                                    }
                                default:
                                    int i17 = c2Var.f86138a;
                                    Object obj3 = c2Var.f86142e;
                                    switch (i17) {
                                        case 0:
                                            ((tb.c) obj3).o(z15, z14);
                                            break;
                                        default:
                                            ((tb.e) obj3).m(z15, z14);
                                            break;
                                    }
                            }
                        }
                    });
                    break;
                }
                break;
            default:
                if (this.f86140c) {
                    this.f86140c = false;
                    final boolean z14 = this.f86141d;
                    final int i15 = 1;
                    ((d7.i0) ((d7.o) obj)).d(new Runnable() { // from class: m7.b2

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f86111b = false;

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i152 = i15;
                            boolean z142 = z14;
                            boolean z15 = this.f86111b;
                            c2 c2Var = (c2) this;
                            switch (i152) {
                                case 0:
                                    int i16 = c2Var.f86138a;
                                    Object obj2 = c2Var.f86142e;
                                    switch (i16) {
                                        case 0:
                                            ((tb.c) obj2).o(z15, z142);
                                            break;
                                        default:
                                            ((tb.e) obj2).m(z15, z142);
                                            break;
                                    }
                                default:
                                    int i17 = c2Var.f86138a;
                                    Object obj3 = c2Var.f86142e;
                                    switch (i17) {
                                        case 0:
                                            ((tb.c) obj3).o(z15, z142);
                                            break;
                                        default:
                                            ((tb.e) obj3).m(z15, z142);
                                            break;
                                    }
                            }
                        }
                    });
                    break;
                }
                break;
        }
    }

    public final void b(final boolean z13) {
        int i13 = this.f86138a;
        Object obj = this.f86139b;
        switch (i13) {
            case 0:
                if (this.f86141d != z13) {
                    this.f86141d = z13;
                    if (this.f86140c) {
                        final int i14 = 0;
                        ((d7.i0) ((d7.o) obj)).d(new Runnable() { // from class: m7.a2
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i15 = i14;
                                boolean z14 = z13;
                                c2 c2Var = (c2) this;
                                switch (i15) {
                                    case 0:
                                        int i16 = c2Var.f86138a;
                                        Object obj2 = c2Var.f86142e;
                                        switch (i16) {
                                            case 0:
                                                ((tb.c) obj2).o(true, z14);
                                                break;
                                            default:
                                                ((tb.e) obj2).m(true, z14);
                                                break;
                                        }
                                    default:
                                        int i17 = c2Var.f86138a;
                                        Object obj3 = c2Var.f86142e;
                                        switch (i17) {
                                            case 0:
                                                ((tb.c) obj3).o(true, z14);
                                                break;
                                            default:
                                                ((tb.e) obj3).m(true, z14);
                                                break;
                                        }
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            default:
                if (this.f86141d != z13) {
                    this.f86141d = z13;
                    if (this.f86140c) {
                        final int i15 = 1;
                        ((d7.i0) ((d7.o) obj)).d(new Runnable() { // from class: m7.a2
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i152 = i15;
                                boolean z14 = z13;
                                c2 c2Var = (c2) this;
                                switch (i152) {
                                    case 0:
                                        int i16 = c2Var.f86138a;
                                        Object obj2 = c2Var.f86142e;
                                        switch (i16) {
                                            case 0:
                                                ((tb.c) obj2).o(true, z14);
                                                break;
                                            default:
                                                ((tb.e) obj2).m(true, z14);
                                                break;
                                        }
                                    default:
                                        int i17 = c2Var.f86138a;
                                        Object obj3 = c2Var.f86142e;
                                        switch (i17) {
                                            case 0:
                                                ((tb.c) obj3).o(true, z14);
                                                break;
                                            default:
                                                ((tb.e) obj3).m(true, z14);
                                                break;
                                        }
                                }
                            }
                        });
                        break;
                    }
                }
                break;
        }
    }
}
