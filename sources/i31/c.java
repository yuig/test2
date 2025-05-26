package i31;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.pinterest.api.model.kj;
import com.pinterest.api.model.vh;
import com.pinterest.feature.profile.allpins.view.ProfileAllPinsRep;
import com.pinterest.gestalt.text.GestaltText;
import d51.j;
import d51.k;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le0.g;
import m60.w0;
import pk.a0;
import qv0.d0;
import vq0.h;
import yk1.m;
import yk1.n;

/* loaded from: classes5.dex */
public final class c extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f71467a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f71468b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f71469c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71470d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71471e;

    public c(j clickHandler, k pinCountHandler, k lastSavedTimeHandler, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        Intrinsics.checkNotNullParameter(pinCountHandler, "pinCountHandler");
        Intrinsics.checkNotNullParameter(lastSavedTimeHandler, "lastSavedTimeHandler");
        this.f71467a = clickHandler;
        this.f71468b = pinCountHandler;
        this.f71469c = lastSavedTimeHandler;
        this.f71470d = z13;
        this.f71471e = z14;
    }

    @Override // vq0.h
    public final void c(n nVar, Object obj, int i13) {
        String quantityString;
        CharSequence charSequence;
        ProfileAllPinsRep view = (ProfileAllPinsRep) nVar;
        vh viewModel = (vh) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewModel, "model");
        int intValue = ((Number) this.f71468b.invoke()).intValue();
        Date date = (Date) this.f71469c.invoke();
        view.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        kj kjVar = viewModel.f42855m;
        CharSequence charSequence2 = null;
        String a13 = kjVar != null ? kjVar.a() : null;
        if (a13 == null) {
            a13 = "";
        }
        GestaltText gestaltText = view.f47477e;
        a0.p(gestaltText, a13);
        boolean z13 = this.f71471e;
        if (z13) {
            gestaltText.i(b.f71466i);
        }
        view.d0(viewModel);
        if (!this.f71470d) {
            quantityString = view.getResources().getQuantityString(g.plural_pins, intValue, Integer.valueOf(intValue));
        } else {
            if (view.f47491s == null) {
                Intrinsics.r("numberFormatter");
                throw null;
            }
            quantityString = view.getResources().getQuantityString(w0.plural_pins_string, intValue, qb0.j.b(intValue));
        }
        Intrinsics.f(quantityString);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        pb0.b bVar = z13 ? pb0.b.STYLE_COMPACT_NO_BOLDING : pb0.b.STYLE_COMPACT;
        boolean z14 = false;
        byte b13 = 0;
        if (date != null) {
            pb0.h p13 = xa0.j.p(date);
            pb0.d dVar = view.f47490r;
            if (dVar == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            charSequence = dVar.c(p13, pb0.b.STYLE_NORMAL, true);
            pb0.d dVar2 = view.f47490r;
            if (dVar2 == null) {
                Intrinsics.r("fuzzyDateFormatter");
                throw null;
            }
            charSequence2 = dVar2.c(p13, bVar, false);
        } else {
            charSequence = null;
        }
        if (charSequence2 != null && charSequence2.length() != 0) {
            spannableStringBuilder.append((CharSequence) (z13 ? " · " : "  "));
            if (charSequence != null) {
                view.f47478f.i(new y11.c(8, spannableStringBuilder, charSequence));
            }
            int length = z13 ? 0 : spannableStringBuilder.length();
            spannableStringBuilder.append(charSequence2);
            Context context = view.getContext();
            int i14 = eo1.b.color_gray_500;
            Object obj2 = d5.a.f53679a;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i14)), length, spannableStringBuilder.length(), 33);
        }
        ProfileAllPinsRep.o0(view, bs1.c.h2(SpannableString.valueOf(spannableStringBuilder)), z13);
        view.f47479g.t(new a(z14, b13 == true ? 1 : 0));
        view.setOnClickListener(new d0(14, this, viewModel));
    }

    @Override // vq0.h
    public final m f() {
        return null;
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        vh model = (vh) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
