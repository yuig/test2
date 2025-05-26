package com.pinterest.feature.search.typeahead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import ar0.b;
import br.c;
import br.d;
import h32.g0;
import h32.n2;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k71.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.u0;
import nx.v;
import o71.s;
import org.jetbrains.annotations.NotNull;
import pe.i;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, d2 = {"Lcom/pinterest/feature/search/typeahead/view/SearchTypeaheadPeopleCell;", "Landroid/widget/LinearLayout;", "Lk71/h;", "Lar0/b;", "Lnx/v;", "Lnx/u0;", "searchLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SearchTypeaheadPeopleCell extends LinearLayout implements h, b, v {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f47864g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final xk2.v f47865a;

    /* renamed from: b, reason: collision with root package name */
    public final xk2.v f47866b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f47867c;

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f47868d;

    /* renamed from: e, reason: collision with root package name */
    public s f47869e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47870f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadPeopleCell(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        n2 n2Var;
        String str;
        String str2;
        c cVar;
        String t13;
        s sVar = this.f47869e;
        if (sVar == null) {
            return null;
        }
        n2 source = sVar.f93371e;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            n2Var = new n2(source.f67157a, source.f67158b, source.f67159c, source.f67160d, jq.b.c(TimeUnit.MILLISECONDS), source.f67162f, source.f67163g, source.f67164h, source.f67165i, source.f67166j);
        } else {
            n2Var = null;
        }
        sVar.f93371e = null;
        if (n2Var == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        d dVar = sVar.f93370d;
        if (dVar != null && (cVar = dVar.f23707e) != null && (t13 = i.t(cVar)) != null) {
        }
        d dVar2 = sVar.f93370d;
        if (dVar2 != null && (str2 = dVar2.f23704b) != null) {
        }
        String R0 = dl2.b.R0(sVar.f93373g);
        if (R0 != null) {
        }
        d dVar3 = sVar.f93370d;
        if (dVar3 != null && (str = dVar3.f23703a) != null) {
            hashMap.put("ac_suggestion_id", str);
        }
        hashMap.put("result_index", String.valueOf(sVar.f93372f));
        return new u0(n2Var, hashMap, g0.TYPEAHEAD_SUGGESTIONS);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        s sVar = this.f47869e;
        if (sVar == null) {
            return null;
        }
        if (sVar.f93371e == null) {
            d dVar = sVar.f93370d;
            sVar.f93371e = new n2(dVar != null ? dVar.f23704b : null, null, null, jq.b.c(TimeUnit.MILLISECONDS), null, null, Short.valueOf((short) sVar.f93372f), null, null, null);
        }
        n2 n2Var = sVar.f93371e;
        if (n2Var != null) {
            return new u0(n2Var, null, null);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchTypeaheadPeopleCell(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SearchTypeaheadPeopleCell(android.content.Context r4, android.util.AttributeSet r5, int r6, vn1.c r7, int r8) {
        /*
            r3 = this;
            r0 = r8 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r5 = r1
        L6:
            r0 = r8 & 4
            r2 = 0
            if (r0 == 0) goto Lc
            r6 = r2
        Lc:
            r0 = 8
            r8 = r8 & r0
            if (r8 == 0) goto L12
            r7 = r1
        L12:
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r8)
            r3.<init>(r4, r5, r6)
            q71.c0 r5 = new q71.c0
            r6 = 2
            r5.<init>(r3, r6)
            xk2.v r5 = xk2.m.b(r5)
            r3.f47865a = r5
            q71.c0 r5 = new q71.c0
            r6 = 3
            r5.<init>(r3, r6)
            xk2.v r5 = xk2.m.b(r5)
            r3.f47866b = r5
            q71.c0 r5 = new q71.c0
            r6 = 1
            r5.<init>(r3, r6)
            xk2.v r5 = xk2.m.b(r5)
            r3.f47867c = r5
            q71.c0 r5 = new q71.c0
            r5.<init>(r3, r2)
            xk2.v r5 = xk2.m.b(r5)
            r3.f47868d = r5
            int r6 = k42.e.list_search_typeahead_people_item
            android.view.View.inflate(r4, r6, r3)
            android.view.ViewGroup$MarginLayoutParams r6 = new android.view.ViewGroup$MarginLayoutParams
            r8 = -1
            r1 = -2
            r6.<init>(r8, r1)
            r3.setLayoutParams(r6)
            r3.setOrientation(r2)
            int r6 = k42.c.rounded_corners_pressed_state
            java.lang.Object r8 = d5.a.f53679a
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r3.setBackground(r4)
            android.content.res.Resources r4 = r3.getResources()
            int r6 = eo1.c.space_200
            int r4 = r4.getDimensionPixelSize(r6)
            android.content.res.Resources r6 = r3.getResources()
            java.lang.String r8 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r8 = 16
            int r6 = pk.a0.K(r8, r6)
            r3.setPaddingRelative(r6, r4, r6, r4)
            x61.e r4 = new x61.e
            r4.<init>(r3, r0)
            r3.setOnClickListener(r4)
            java.lang.Object r4 = r5.getValue()
            java.lang.String r5 = "getValue(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            com.pinterest.gestalt.button.view.GestaltButton r4 = (com.pinterest.gestalt.button.view.GestaltButton) r4
            q71.q r5 = q71.q.f102742n
            r4.d(r5)
            if (r7 == 0) goto Lc0
            int r4 = k42.d.cell_desc
            android.view.View r4 = r3.findViewById(r4)
            com.pinterest.gestalt.text.GestaltText r4 = (com.pinterest.gestalt.text.GestaltText) r4
            sp.a r5 = new sp.a
            r6 = 13
            r5.<init>(r6, r7)
            r4.i(r5)
            int r4 = k42.d.cell_title
            android.view.View r4 = r3.findViewById(r4)
            com.pinterest.gestalt.text.GestaltText r4 = (com.pinterest.gestalt.text.GestaltText) r4
            sp.a r5 = new sp.a
            r6 = 14
            r5.<init>(r6, r7)
            r4.i(r5)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell.<init>(android.content.Context, android.util.AttributeSet, int, vn1.c, int):void");
    }
}
