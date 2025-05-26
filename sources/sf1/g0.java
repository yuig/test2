package sf1;

import android.content.Context;
import android.os.Handler;
import android.widget.SeekBar;
import com.pinterest.feature.storypin.closeup.view.IdeaPinScrubber;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.ui.CameraPreview;

/* loaded from: classes5.dex */
public final class g0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public a0 f112573a;

    /* renamed from: b, reason: collision with root package name */
    public Long f112574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h0 f112575c;

    public g0(h0 h0Var) {
        this.f112575c = h0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
        a0 a0Var;
        a0 a0Var2;
        PinterestVideoView o13;
        PinterestVideoView o14;
        int i14;
        ArrayList arrayList;
        float f13;
        h0 h0Var = this.f112575c;
        if (z13) {
            IdeaPinScrubber ideaPinScrubber = h0Var.f112590o;
            float f14 = i13 / 1000.0f;
            int i15 = ideaPinScrubber.f48564g;
            float f15 = 0.0f;
            if (i15 == 1) {
                ideaPinScrubber.h(kotlin.collections.e0.b(new r0(0, IdeaPinScrubber.e(f14))));
            } else if (i15 > 1) {
                i14 = 0;
                float f16 = 0.0f;
                float f17 = 0.0f;
                while (true) {
                    arrayList = ideaPinScrubber.f48565h;
                    if (i14 >= i15) {
                        i14 = 0;
                        break;
                    }
                    ArrayList arrayList2 = ideaPinScrubber.f48567j;
                    if (f14 >= f16 && f14 < ((Number) arrayList2.get(i14)).floatValue() + f16) {
                        break;
                    }
                    float floatValue = ((Number) arrayList2.get(i14)).floatValue();
                    int c13 = ideaPinScrubber.c();
                    int i16 = ideaPinScrubber.f48563f;
                    f16 += floatValue + (i16 / c13);
                    f17 += ((Number) arrayList.get(i14)).intValue() + i16;
                    i14++;
                }
                int i17 = 0;
                while (true) {
                    f13 = 1.0f;
                    if (i17 >= i14) {
                        break;
                    }
                    ideaPinScrubber.h(kotlin.collections.e0.b(new r0(i17, IdeaPinScrubber.e(1.0f))));
                    i17++;
                }
                float c14 = ((f14 * ideaPinScrubber.c()) - f17) / ((Number) arrayList.get(i14)).floatValue();
                if (c14 >= 1.0f) {
                    if (i14 < arrayList.size() - 1) {
                        i14++;
                        f13 = 0.0f;
                    }
                    c14 = f13;
                } else if (c14 < 0.0f) {
                    c14 = 0.0f;
                }
                ideaPinScrubber.h(kotlin.collections.e0.b(new r0(i14, IdeaPinScrubber.e(c14))));
                int i18 = ideaPinScrubber.f48564g;
                for (int i19 = i14 + 1; i19 < i18; i19++) {
                    ideaPinScrubber.h(kotlin.collections.e0.b(new r0(i19, IdeaPinScrubber.e(0.0f))));
                }
                f15 = c14;
                a0Var = new a0(i14, f15);
            }
            i14 = 0;
            a0Var = new a0(i14, f15);
        } else {
            a0Var = null;
        }
        this.f112573a = a0Var;
        GestaltText gestaltText = h0Var.f112589n;
        float f18 = i13;
        IdeaPinScrubber ideaPinScrubber2 = h0Var.f112590o;
        pk.a0.p(gestaltText, ac2.d.a((long) ((f18 / 1000.0f) * ideaPinScrubber2.f48569l), ac2.q1.VIDEO_CLOSE_UP, ac2.e1.ROUND));
        if (h0Var.f112581f && z13 && (a0Var2 = this.f112573a) != null) {
            i0 i0Var = h0Var.f112582g;
            if (((e1) i0Var).F.f94412j.size() == 1) {
                e1 e1Var = (e1) i0Var;
                int i23 = e1Var.f112558q.f19924d;
                long b13 = (long) ((f18 / 1000) * ideaPinScrubber2.b(i23));
                Long l13 = this.f112574b;
                if (l13 == null || Math.abs(l13.longValue() - b13) >= 800) {
                    s C = e1Var.F.C(i23);
                    if (C != null && (o14 = C.o()) != null) {
                        o14.j(b13, true);
                    }
                    this.f112574b = Long.valueOf(b13);
                    return;
                }
                return;
            }
            e1 e1Var2 = (e1) i0Var;
            int i24 = e1Var2.f112558q.f19924d;
            int i25 = a0Var2.f112507a;
            long b14 = (long) (a0Var2.f112508b * ideaPinScrubber2.b(i25));
            int abs = Math.abs(e1Var2.f112558q.f19924d - i25);
            if (abs > 0) {
                e1Var2.d0(i25, false);
                s C2 = e1Var2.F.C(i24);
                if (C2 != null) {
                    PinterestVideoView o15 = C2.o();
                    if (o15 != null && o15.f18950o != 0) {
                        o15.f18950o = 0;
                        o15.F();
                    }
                    C2.C();
                }
            }
            boolean z14 = abs <= 1;
            Long l14 = this.f112574b;
            if (l14 == null || Math.abs(l14.longValue() - b14) >= 800) {
                if (z14) {
                    s C3 = e1Var2.F.C(i25);
                    if (C3 != null && (o13 = C3.o()) != null) {
                        o13.j(b14, true);
                    }
                } else {
                    e1Var2.R = Long.valueOf(b14);
                }
                this.f112574b = Long.valueOf(b14);
            }
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        h0 h0Var = this.f112575c;
        h0Var.f112590o.f48570m = true;
        i0 i0Var = h0Var.f112582g;
        e1 e1Var = (e1) i0Var;
        j1 j1Var = e1Var.G;
        if (j1Var != null) {
            j1.L0(j1Var, h32.f1.SEEK, null, null, 14);
        }
        kg.a.V(e1Var.A, false);
        e1Var.getEventManager().d(new pf1.a(false));
        if (h0Var.f112581f) {
            e1 e1Var2 = (e1) i0Var;
            s C = e1Var2.F.C(e1Var2.f112558q.f19924d);
            if (C != null) {
                PinterestVideoView o13 = C.o();
                if (o13 != null && o13.f18950o != 0) {
                    o13.f18950o = 0;
                    o13.F();
                }
                C.C();
            }
        }
        if (h0Var.f112596u) {
            Context context = h0Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (df.j1.l(context)) {
                h0Var.A.cancel();
            } else {
                h0Var.getHandler().removeCallbacksAndMessages(null);
            }
            h0Var.g0();
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        PinterestVideoView o13;
        PinterestVideoView o14;
        h0 h0Var = this.f112575c;
        boolean T = h0Var.T();
        i0 i0Var = h0Var.f112582g;
        e1 e1Var = (e1) i0Var;
        kg.a.V(e1Var.A, true);
        e1Var.getEventManager().d(new pf1.a(true));
        int size = ((e1) i0Var).F.f94412j.size();
        IdeaPinScrubber ideaPinScrubber = h0Var.f112590o;
        if (size == 1) {
            Integer valueOf = seekBar != null ? Integer.valueOf(seekBar.getProgress()) : null;
            e1 e1Var2 = (e1) i0Var;
            s C = e1Var2.F.C(e1Var2.f112558q.f19924d);
            if (valueOf != null && C != null) {
                long intValue = (long) ((valueOf.intValue() / 1000) * ideaPinScrubber.b(((e1) i0Var).f112558q.f19924d));
                PinterestVideoView o15 = C.o();
                if (o15 != null) {
                    o15.j(intValue, true);
                }
            }
        } else {
            a0 a0Var = this.f112573a;
            if (a0Var != null) {
                int i13 = ((e1) i0Var).f112558q.f19924d;
                int i14 = a0Var.f112507a;
                int abs = Math.abs(i13 - i14);
                if (abs > 0) {
                    ((e1) i0Var).d0(i14, false);
                }
                boolean z13 = abs <= 1;
                e1 e1Var3 = (e1) i0Var;
                j1 j1Var = e1Var3.G;
                boolean x43 = j1Var != null ? ((rf1.p0) j1Var).x4(i14) : false;
                float f13 = a0Var.f112508b;
                if (x43) {
                    long b13 = (long) (f13 * ideaPinScrubber.b(i14));
                    if (z13) {
                        s C2 = e1Var3.F.C(i14);
                        if (C2 != null && (o13 = C2.o()) != null) {
                            o13.j(b13, true);
                        }
                    } else {
                        e1Var3.R = Long.valueOf(b13);
                    }
                } else {
                    ideaPinScrubber.f48570m = false;
                    ideaPinScrubber.g(i14, f13);
                    k0 k0Var = h0Var.f112597v;
                    if (k0Var != null) {
                        k0Var.f112643g = f13;
                        k0Var.f112640d = (int) ((f13 * 5000) / 50);
                    }
                    if (k0Var != null) {
                        j1 j1Var2 = e1Var3.G;
                        String videoStateId = (j1Var2 != null ? ((rf1.p0) j1Var2).u4() : null) + "-" + i14;
                        Intrinsics.checkNotNullParameter(videoStateId, "videoStateId");
                        if (!nc2.h.a(videoStateId).f90409a) {
                            if (!k0Var.f112641e) {
                                Handler handler = k0Var.f112638b;
                                handler.removeCallbacksAndMessages(null);
                                k0Var.f112641e = true;
                                handler.post(k0Var.f112639c);
                            }
                            k0Var.f112642f = false;
                        }
                    }
                }
                boolean z14 = e1Var3.f112559r.f112592q.w().f96639a == rm1.q.MUTE;
                of1.b bVar = e1Var3.F;
                if (z14) {
                    bVar.E();
                } else {
                    bVar.F();
                }
            }
            if (bs1.c.o1(h0Var.f112587l)) {
                h0Var.L(null);
            }
        }
        ideaPinScrubber.f48570m = false;
        if (T) {
            h0Var.k0(true);
        }
        if (h0Var.f112581f) {
            e1 e1Var4 = (e1) i0Var;
            s C3 = e1Var4.F.C(e1Var4.f112558q.f19924d);
            if (!T && C3 != null) {
                C3.D();
            }
            if (C3 != null && (o14 = C3.o()) != null && o14.f18950o != 2) {
                o14.f18950o = 2;
                o14.F();
            }
        }
        if (!h0Var.f112596u || T) {
            return;
        }
        h0Var.L(Long.valueOf(CameraPreview.AUTOFOCUS_INTERVAL_MILLIS));
    }
}
