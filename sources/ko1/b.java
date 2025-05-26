package ko1;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import r5.e;
import vb0.j;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class b extends y5.b {

    /* renamed from: o, reason: collision with root package name */
    public final AppCompatTextView f80299o;

    /* renamed from: p, reason: collision with root package name */
    public final List f80300p;

    /* renamed from: q, reason: collision with root package name */
    public final List f80301q;

    /* renamed from: r, reason: collision with root package name */
    public final v f80302r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f80303s;

    /* renamed from: t, reason: collision with root package name */
    public final ClickableSpan[] f80304t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AppCompatTextView textView, List clickableStringList, List contentDescriptionList, SpannableStringBuilder spannableStrings) {
        super(textView);
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(clickableStringList, "clickableStringList");
        Intrinsics.checkNotNullParameter(contentDescriptionList, "contentDescriptionList");
        Intrinsics.checkNotNullParameter(spannableStrings, "spannableStrings");
        this.f80299o = textView;
        this.f80300p = clickableStringList;
        this.f80301q = contentDescriptionList;
        this.f80302r = m.b(a.f80298i);
        List<String> list = clickableStringList;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        for (String str : list) {
            AppCompatTextView appCompatTextView = this.f80299o;
            appCompatTextView.measure(0, 0);
            TextPaint paint = appCompatTextView.getPaint();
            Rect rect = (Rect) this.f80302r.getValue();
            paint.getTextBounds(str, 0, str.length(), rect);
            int baseline = appCompatTextView.getBaseline();
            rect.top += baseline;
            rect.bottom = baseline + rect.bottom;
            arrayList.add(rect);
        }
        this.f80303s = arrayList;
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableStrings.getSpans(0, this.f80299o.getText().length(), ClickableSpan.class);
        this.f80304t = clickableSpanArr;
        if (arrayList.size() == clickableSpanArr.length && arrayList.size() == this.f80300p.size() && arrayList.size() == this.f80301q.size()) {
            return;
        }
        j.f125466a.H(new IllegalArgumentException("clickableSpanBounds, clickableSpanList and clickableStringList should has same size."));
    }

    @Override // y5.b
    public final void m(ArrayList arrayList) {
        int size = this.f80300p.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
    }

    @Override // y5.b
    public final boolean p(int i13, int i14, Bundle bundle) {
        if (16 != i14 || i13 < 0) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = this.f80304t;
        if (i13 >= clickableSpanArr.length) {
            return false;
        }
        clickableSpanArr[i13].onClick(this.f80299o);
        return true;
    }

    @Override // y5.b
    public final void r(int i13, e node) {
        Intrinsics.checkNotNullParameter(node, "node");
        List list = this.f80300p;
        if (i13 >= 0 && i13 < list.size()) {
            node.o((Rect) this.f80303s.get(i13));
            node.a(16);
            node.v((CharSequence) this.f80301q.get(i13));
        } else {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                node.f106231a.addChild(this.f80299o, i14);
            }
        }
    }
}
