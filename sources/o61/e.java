package o61;

import a7.t0;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.ProgressBar;
import com.pinterest.api.model.ag0;
import com.pinterest.api.model.ef0;
import com.pinterest.api.model.hf0;
import com.pinterest.api.model.xf0;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import dl1.s;
import ek2.j;
import j41.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m7.l0;
import pk.a0;
import uj2.q;

/* loaded from: classes5.dex */
public final class e implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f92962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m61.b f92963b;

    public e(f fVar, m61.b bVar) {
        this.f92962a = fVar;
        this.f92963b = bVar;
    }

    @Override // a7.t0
    public final void K6(boolean z13) {
        f fVar = this.f92962a;
        fVar.f92969f = z13;
        if (!z13) {
            j jVar = fVar.f92968e;
            if (jVar != null) {
                bk2.c.dispose(jVar);
                return;
            }
            return;
        }
        l0 l0Var = fVar.f92967d;
        if (l0Var == null) {
            Intrinsics.r("exoPlayer");
            throw null;
        }
        long duration = l0Var.getDuration();
        l0 l0Var2 = fVar.f92967d;
        if (l0Var2 == null) {
            Intrinsics.r("exoPlayer");
            throw null;
        }
        long X = duration - l0Var2.X();
        j jVar2 = fVar.f92968e;
        if (jVar2 != null) {
            bk2.c.dispose(jVar2);
        }
        fVar.f92968e = (j) q.x(500L, 500L, TimeUnit.MILLISECONDS, tk2.e.f118016b).I(X).A(wj2.c.a()).F(new u51.b(8, new i(fVar, 13)), ck2.i.f27925e, ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // a7.t0
    public final void r0(int i13) {
        ag0 ag0Var;
        Throwable th3;
        Unit unit;
        m61.b bVar = this.f92963b;
        f fVar = this.f92962a;
        if (i13 == 2 && !fVar.f92970g) {
            fVar.f92970g = true;
            GestaltText gestaltText = ((c) bVar).f92954p0;
            if (gestaltText != null) {
                gestaltText.setVisibility(0);
                return;
            } else {
                Intrinsics.r("loading");
                throw null;
            }
        }
        if (i13 == 3) {
            c cVar = (c) bVar;
            GestaltText gestaltText2 = cVar.f92954p0;
            if (gestaltText2 == null) {
                Intrinsics.r("loading");
                throw null;
            }
            gestaltText2.setVisibility(8);
            cVar.b8(f.p3(fVar));
            l0 l0Var = fVar.f92967d;
            if (l0Var == null) {
                Intrinsics.r("exoPlayer");
                throw null;
            }
            int duration = (int) l0Var.getDuration();
            ProgressBar progressBar = cVar.f92960v0;
            if (progressBar == null) {
                Intrinsics.r("progressBar");
                throw null;
            }
            progressBar.setMax(duration);
            fVar.s3();
            fVar.f92966c.a(0L, "MICROTREATMENT_AUDIO_DID_START");
            return;
        }
        if (i13 == 4) {
            fVar.f92966c.a(0L, "MICROTREATMENT_AUDIO_DID_FINISH");
            hf0 safetyAudioTreatment = fVar.f92965b;
            List M = safetyAudioTreatment.M();
            if (M != null) {
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    s a13 = ((ef0) it.next()).a();
                    if (a13 != null && (a13 instanceof ag0)) {
                        ag0Var = (ag0) a13;
                        break;
                    }
                }
            }
            xf0 xf0Var = new xf0(0);
            ag0Var = new ag0(xf0Var.f43666a, xf0Var.f43667b, xf0Var.f43668c, xf0Var.f43669d, xf0Var.f43670e, xf0Var.f43671f, xf0Var.f43672g, xf0Var.f43673h, xf0Var.f43674i, xf0Var.f43675j, 0);
            Intrinsics.checkNotNullExpressionValue(ag0Var, "build(...)");
            String text = ag0Var.q();
            if (text != null) {
                c cVar2 = (c) bVar;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(text, "quote");
                Integer num = cVar2.f92952n0;
                if (num != null) {
                    int intValue = num.intValue();
                    GestaltText gestaltText3 = cVar2.f92955q0;
                    if (gestaltText3 == null) {
                        Intrinsics.r("quoteView");
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(text, "text");
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(intValue);
                    SpannableString spannableString = new SpannableString(text);
                    spannableString.setSpan(foregroundColorSpan, 0, text.length(), 0);
                    a0.q(gestaltText3, bs1.c.h2(spannableString));
                    unit = Unit.f80348a;
                    th3 = null;
                } else {
                    th3 = null;
                    unit = null;
                }
                if (unit == null) {
                    GestaltText gestaltText4 = cVar2.f92955q0;
                    if (gestaltText4 == null) {
                        Intrinsics.r("quoteView");
                        throw th3;
                    }
                    a0.p(gestaltText4, text);
                }
                Context context = fVar.f92964a;
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(safetyAudioTreatment, "safetyAudioTreatment");
                int parseColor = Color.parseColor(a0.q0(context) ? safetyAudioTreatment.K() : safetyAudioTreatment.L());
                cVar2.f92952n0 = Integer.valueOf(parseColor);
                GestaltText gestaltText5 = cVar2.f92955q0;
                if (gestaltText5 == null) {
                    Intrinsics.r("quoteView");
                    throw null;
                }
                String text2 = a0.R(gestaltText5);
                Intrinsics.checkNotNullParameter(text2, "text");
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(parseColor);
                SpannableString spannableString2 = new SpannableString(text2);
                spannableString2.setSpan(foregroundColorSpan2, 0, text2.length(), 0);
                a0.q(gestaltText5, bs1.c.h2(spannableString2));
            }
            c cVar3 = (c) bVar;
            GestaltIconButtonFloating gestaltIconButtonFloating = cVar3.f92959u0;
            if (gestaltIconButtonFloating == null) {
                Intrinsics.r("playButton");
                throw null;
            }
            pp2.a.j(gestaltIconButtonFloating, b.f92942j);
            GestaltText gestaltText6 = cVar3.f92953o0;
            if (gestaltText6 == null) {
                Intrinsics.r("duration");
                throw null;
            }
            gestaltText6.setVisibility(4);
            WebImageView webImageView = cVar3.f92956r0;
            if (webImageView == null) {
                Intrinsics.r("backgroundView");
                throw null;
            }
            webImageView.setVisibility(8);
            GestaltIconButton gestaltIconButton = cVar3.f92958t0;
            if (gestaltIconButton == null) {
                Intrinsics.r("advance");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton);
            GestaltIconButton gestaltIconButton2 = cVar3.f92957s0;
            if (gestaltIconButton2 == null) {
                Intrinsics.r("rewind");
                throw null;
            }
            com.bumptech.glide.c.d0(gestaltIconButton2);
            GestaltIconButtonFloating gestaltIconButtonFloating2 = cVar3.f92959u0;
            if (gestaltIconButtonFloating2 == null) {
                Intrinsics.r("playButton");
                throw null;
            }
            gestaltIconButtonFloating2.c(new a(cVar3, 4));
            l0 l0Var2 = fVar.f92967d;
            if (l0Var2 == null) {
                Intrinsics.r("exoPlayer");
                throw null;
            }
            int duration2 = (int) l0Var2.getDuration();
            ProgressBar progressBar2 = cVar3.f92960v0;
            if (progressBar2 != null) {
                progressBar2.setProgress(duration2, true);
            } else {
                Intrinsics.r("progressBar");
                throw null;
            }
        }
    }
}
