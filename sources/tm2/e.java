package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class e extends zm2.t {

    /* renamed from: p, reason: collision with root package name */
    public static final e f118204p;

    /* renamed from: q, reason: collision with root package name */
    public static final a f118205q = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118206a;

    /* renamed from: b, reason: collision with root package name */
    public int f118207b;

    /* renamed from: c, reason: collision with root package name */
    public d f118208c;

    /* renamed from: d, reason: collision with root package name */
    public long f118209d;

    /* renamed from: e, reason: collision with root package name */
    public float f118210e;

    /* renamed from: f, reason: collision with root package name */
    public double f118211f;

    /* renamed from: g, reason: collision with root package name */
    public int f118212g;

    /* renamed from: h, reason: collision with root package name */
    public int f118213h;

    /* renamed from: i, reason: collision with root package name */
    public int f118214i;

    /* renamed from: j, reason: collision with root package name */
    public h f118215j;

    /* renamed from: k, reason: collision with root package name */
    public List f118216k;

    /* renamed from: l, reason: collision with root package name */
    public int f118217l;

    /* renamed from: m, reason: collision with root package name */
    public int f118218m;

    /* renamed from: n, reason: collision with root package name */
    public byte f118219n;

    /* renamed from: o, reason: collision with root package name */
    public int f118220o;

    static {
        e eVar = new e();
        f118204p = eVar;
        eVar.h();
    }

    public e() {
        this.f118219n = (byte) -1;
        this.f118220o = -1;
        this.f118206a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118220o;
        if (i13 != -1) {
            return i13;
        }
        int d2 = (this.f118207b & 1) == 1 ? zm2.i.d(1, this.f118208c.getNumber()) : 0;
        if ((this.f118207b & 2) == 2) {
            d2 += zm2.i.n(this.f118209d);
        }
        if ((this.f118207b & 4) == 4) {
            d2 += zm2.i.e();
        }
        if ((this.f118207b & 8) == 8) {
            d2 += zm2.i.c();
        }
        if ((this.f118207b & 16) == 16) {
            d2 += zm2.i.f(5, this.f118212g);
        }
        if ((this.f118207b & 32) == 32) {
            d2 += zm2.i.f(6, this.f118213h);
        }
        if ((this.f118207b & 64) == 64) {
            d2 += zm2.i.f(7, this.f118214i);
        }
        if ((this.f118207b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            d2 += zm2.i.i(8, this.f118215j);
        }
        for (int i14 = 0; i14 < this.f118216k.size(); i14++) {
            d2 += zm2.i.i(9, (zm2.c) this.f118216k.get(i14));
        }
        if ((this.f118207b & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            d2 += zm2.i.f(10, this.f118218m);
        }
        if ((this.f118207b & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            d2 += zm2.i.f(11, this.f118217l);
        }
        int size = this.f118206a.size() + d2;
        this.f118220o = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return c.h();
    }

    @Override // zm2.c
    public final zm2.b c() {
        c h10 = c.h();
        h10.k(this);
        return h10;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118207b & 1) == 1) {
            iVar.A(1, this.f118208c.getNumber());
        }
        if ((this.f118207b & 2) == 2) {
            iVar.U(this.f118209d);
        }
        if ((this.f118207b & 4) == 4) {
            iVar.D(this.f118210e);
        }
        if ((this.f118207b & 8) == 8) {
            iVar.y(this.f118211f);
        }
        if ((this.f118207b & 16) == 16) {
            iVar.F(5, this.f118212g);
        }
        if ((this.f118207b & 32) == 32) {
            iVar.F(6, this.f118213h);
        }
        if ((this.f118207b & 64) == 64) {
            iVar.F(7, this.f118214i);
        }
        if ((this.f118207b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            iVar.I(8, this.f118215j);
        }
        for (int i13 = 0; i13 < this.f118216k.size(); i13++) {
            iVar.I(9, (zm2.c) this.f118216k.get(i13));
        }
        if ((this.f118207b & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            iVar.F(10, this.f118218m);
        }
        if ((this.f118207b & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            iVar.F(11, this.f118217l);
        }
        iVar.L(this.f118206a);
    }

    public final void h() {
        this.f118208c = d.BYTE;
        this.f118209d = 0L;
        this.f118210e = 0.0f;
        this.f118211f = 0.0d;
        this.f118212g = 0;
        this.f118213h = 0;
        this.f118214i = 0;
        this.f118215j = h.f118276g;
        this.f118216k = Collections.emptyList();
        this.f118217l = 0;
        this.f118218m = 0;
    }

    public final c i() {
        c h10 = c.h();
        h10.k(this);
        return h10;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118219n;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118207b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128 && !this.f118215j.isInitialized()) {
            this.f118219n = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118216k.size(); i13++) {
            if (!((e) this.f118216k.get(i13)).isInitialized()) {
                this.f118219n = (byte) 0;
                return false;
            }
        }
        this.f118219n = (byte) 1;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public e(zm2.h hVar, zm2.k kVar) {
        this.f118219n = (byte) -1;
        this.f118220o = -1;
        h();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (true) {
            ?? r53 = 256;
            if (!z13) {
                try {
                    try {
                        int o13 = hVar.o();
                        switch (o13) {
                            case 0:
                                z13 = true;
                            case 8:
                                int j13 = hVar.j();
                                d valueOf = d.valueOf(j13);
                                if (valueOf == null) {
                                    u13.P(o13);
                                    u13.P(j13);
                                } else {
                                    this.f118207b |= 1;
                                    this.f118208c = valueOf;
                                }
                            case 16:
                                this.f118207b |= 2;
                                long k13 = hVar.k();
                                this.f118209d = (-(k13 & 1)) ^ (k13 >>> 1);
                            case 29:
                                this.f118207b |= 4;
                                this.f118210e = Float.intBitsToFloat(hVar.h());
                            case 33:
                                this.f118207b |= 8;
                                this.f118211f = Double.longBitsToDouble(hVar.i());
                            case 40:
                                this.f118207b |= 16;
                                this.f118212g = hVar.j();
                            case 48:
                                this.f118207b |= 32;
                                this.f118213h = hVar.j();
                            case 56:
                                this.f118207b |= 64;
                                this.f118214i = hVar.j();
                            case 66:
                                g h10 = (this.f118207b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128 ? this.f118215j.h() : null;
                                h hVar2 = (h) hVar.f(h.f118277h, kVar);
                                this.f118215j = hVar2;
                                if (h10 != null) {
                                    h10.i(hVar2);
                                    this.f118215j = h10.g();
                                }
                                this.f118207b |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            case 74:
                                if ((c13 & 256) != 256) {
                                    this.f118216k = new ArrayList();
                                    c13 = 256;
                                }
                                this.f118216k.add(hVar.f(f118205q, kVar));
                            case 80:
                                this.f118207b |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                this.f118218m = hVar.j();
                            case 88:
                                this.f118207b |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                this.f118217l = hVar.j();
                            default:
                                r53 = hVar.r(o13, u13);
                                if (r53 == 0) {
                                    z13 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e13) {
                        e13.f80460a = this;
                        throw e13;
                    } catch (IOException e14) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e14.getMessage());
                        invalidProtocolBufferException.f80460a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th3) {
                    if ((c13 & 256) == r53) {
                        this.f118216k = Collections.unmodifiableList(this.f118216k);
                    }
                    try {
                        u13.t();
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        this.f118206a = fVar.d();
                        throw th4;
                    }
                    this.f118206a = fVar.d();
                    throw th3;
                }
            } else {
                if ((c13 & 256) == 256) {
                    this.f118216k = Collections.unmodifiableList(this.f118216k);
                }
                try {
                    u13.t();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f118206a = fVar.d();
                    throw th5;
                }
                this.f118206a = fVar.d();
                return;
            }
        }
    }

    public e(zm2.o oVar) {
        this.f118219n = (byte) -1;
        this.f118220o = -1;
        this.f118206a = oVar.f142242a;
    }
}
