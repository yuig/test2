package nt;

import android.view.View;
import com.pinterest.gestalt.text.GestaltText;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f92018a;

    /* renamed from: b, reason: collision with root package name */
    public final View f92019b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f92020c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f92021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f92022e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f92023f;

    /* renamed from: g, reason: collision with root package name */
    public List f92024g;

    /* renamed from: h, reason: collision with root package name */
    public final Function2 f92025h;

    /* renamed from: i, reason: collision with root package name */
    public Object f92026i;

    public e1(n1 questionId, View view, GestaltText textView, GestaltText errorMessage, int i13, List list, r1 updateSelectionItem) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(updateSelectionItem, "updateSelectionItem");
        this.f92018a = questionId;
        this.f92019b = view;
        this.f92020c = textView;
        this.f92021d = errorMessage;
        this.f92022e = i13;
        this.f92023f = false;
        this.f92024g = list;
        this.f92025h = updateSelectionItem;
    }

    public final void a(String newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        int length = newData.length();
        GestaltText gestaltText = this.f92020c;
        if (length == 0) {
            gestaltText.i(new tq.a0(this, 20));
        } else {
            gestaltText.i(new rq.l2(newData, 9));
        }
        List list = this.f92024g;
        if (list != null) {
            for (Object obj : list) {
                if (((Boolean) this.f92025h.invoke(obj, newData)).booleanValue()) {
                    this.f92026i = obj;
                }
            }
        }
        if (newData.length() > 0) {
            this.f92021d.i(d1.f92002j);
        }
    }
}
