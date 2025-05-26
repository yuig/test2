package com.pinterest.feature.ideaPinCreation.canvas.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import bs1.c;
import com.pinterest.api.model.ho;
import com.pinterest.api.model.jo;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.mo;
import com.pinterest.api.model.oo;
import com.pinterest.api.model.po;
import com.pinterest.api.model.ro;
import com.pinterest.api.model.so;
import com.pinterest.feature.ideaPinCreation.canvas.view.IdeaPinCreationAspectRatioSelector;
import h32.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import vt0.b;
import vt0.e;
import xt0.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/canvas/view/IdeaPinCreationAspectRatioSelector;", "Landroid/widget/HorizontalScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IdeaPinCreationAspectRatioSelector extends HorizontalScrollView {

    /* renamed from: a, reason: collision with root package name */
    public final AspectRatioOrientationButton f45962a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f45963b;

    /* renamed from: c, reason: collision with root package name */
    public AspectRatioButton f45964c;

    /* renamed from: d, reason: collision with root package name */
    public final List f45965d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f45966e;

    /* renamed from: f, reason: collision with root package name */
    public b f45967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationAspectRatioSelector(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AspectRatioOrientationButton aspectRatioOrientationButton = new AspectRatioOrientationButton(context2);
        this.f45962a = aspectRatioOrientationButton;
        this.f45963b = new ArrayList();
        final int i13 = 0;
        List<so> j13 = f0.j(new mo(-1, -1), lo.f39845e, ro.f41632e, po.f41036e, jo.f39102e, oo.f40759e);
        this.f45965d = j13;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        e(aspectRatioOrientationButton);
        aspectRatioOrientationButton.setOnClickListener(new View.OnClickListener(this) { // from class: xt0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinCreationAspectRatioSelector f135908b;

            {
                this.f135908b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                IdeaPinCreationAspectRatioSelector.a(this.f135908b);
            }
        });
        linearLayout.addView(aspectRatioOrientationButton);
        for (so soVar : j13) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            final AspectRatioButton aspectRatioButton = new AspectRatioButton(context3);
            e(aspectRatioButton);
            aspectRatioButton.setOnClickListener(new View.OnClickListener(this) { // from class: xt0.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdeaPinCreationAspectRatioSelector f135910b;

                {
                    this.f135910b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i13;
                    IdeaPinCreationAspectRatioSelector.b(this.f135910b, aspectRatioButton);
                }
            });
            aspectRatioButton.b(soVar);
            linearLayout.addView(aspectRatioButton);
            this.f45963b.add(aspectRatioButton);
        }
        addView(linearLayout);
    }

    public static void a(IdeaPinCreationAspectRatioSelector this$0) {
        b bVar;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AspectRatioOrientationButton aspectRatioOrientationButton = this$0.f45962a;
        e eVar = aspectRatioOrientationButton.f45960a;
        e value = e.LANDSCAPE;
        if (eVar == value) {
            value = e.PORTRAIT;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        if (value != aspectRatioOrientationButton.f45960a) {
            aspectRatioOrientationButton.f45960a = value;
            aspectRatioOrientationButton.a();
        }
        this$0.c(aspectRatioOrientationButton.f45960a);
        so aspectRatio = this$0.d();
        if (aspectRatio != null && (bVar = this$0.f45967f) != null) {
            Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
            IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = ((g) bVar).E0;
            if (ideaPinCreationCanvasCropperContainer == null) {
                Intrinsics.r("canvasCropperContainer");
                throw null;
            }
            ideaPinCreationCanvasCropperContainer.c(aspectRatio);
        }
        d0 d0Var = this$0.f45966e;
        if (d0Var != null) {
            u0 u0Var = u0.IDEA_PIN_CANVAS_ORIENTATION_BUTTON;
            HashMap hashMap = new HashMap();
            hashMap.put("orientation", aspectRatioOrientationButton.f45960a.getText());
            Unit unit = Unit.f80348a;
            d0Var.Z(u0Var, hashMap);
        }
    }

    public static void b(IdeaPinCreationAspectRatioSelector this$0, AspectRatioButton this_apply) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        this$0.getClass();
        if (this_apply.isSelected()) {
            return;
        }
        this$0.f45964c = this_apply;
        Iterator it = this$0.f45963b.iterator();
        while (it.hasNext()) {
            AspectRatioButton aspectRatioButton = (AspectRatioButton) it.next();
            aspectRatioButton.setSelected(Intrinsics.d(aspectRatioButton, this$0.f45964c));
        }
        so aspectRatio = this$0.d();
        if (aspectRatio != null) {
            b bVar = this$0.f45967f;
            if (bVar != null) {
                Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
                IdeaPinCreationCanvasCropperContainer ideaPinCreationCanvasCropperContainer = ((g) bVar).E0;
                if (ideaPinCreationCanvasCropperContainer == null) {
                    Intrinsics.r("canvasCropperContainer");
                    throw null;
                }
                ideaPinCreationCanvasCropperContainer.c(aspectRatio);
            }
            d0 d0Var = this$0.f45966e;
            if (d0Var != null) {
                u0 u0Var = u0.IDEA_PIN_CANVAS_ASPECT_RATIO_OPTION_BUTTON;
                HashMap hashMap = new HashMap();
                hashMap.put("aspect_ratio", aspectRatio instanceof mo ? "original" : aspectRatio.toString());
                Unit unit = Unit.f80348a;
                d0Var.Z(u0Var, hashMap);
            }
        }
    }

    public final void c(e eVar) {
        Iterator it = this.f45963b.iterator();
        while (it.hasNext()) {
            AspectRatioButton aspectRatioButton = (AspectRatioButton) it.next();
            so soVar = aspectRatioButton.f45959b;
            if (soVar == null) {
                Intrinsics.r("aspectRatio");
                throw null;
            }
            if ((soVar.getWidthRatio() <= soVar.getHeightRatio() ? e.PORTRAIT : e.LANDSCAPE) != eVar) {
                ho hoVar = so.f41948c;
                int heightRatio = soVar.getHeightRatio();
                int widthRatio = soVar.getWidthRatio();
                hoVar.getClass();
                aspectRatioButton.b(ho.a(heightRatio, widthRatio));
            }
        }
    }

    public final so d() {
        AspectRatioButton aspectRatioButton = this.f45964c;
        if (aspectRatioButton == null) {
            return null;
        }
        so soVar = aspectRatioButton.f45959b;
        if (soVar != null) {
            return soVar;
        }
        Intrinsics.r("aspectRatio");
        throw null;
    }

    public final void e(FrameLayout frameLayout) {
        int W = c.W(this, eo1.c.space_100);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(W);
        marginLayoutParams.setMarginEnd(W);
        frameLayout.setLayoutParams(marginLayoutParams);
    }

    public final void f(so aspectRatio) {
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        e eVar = aspectRatio.getWidthRatio() <= aspectRatio.getHeightRatio() ? e.PORTRAIT : e.LANDSCAPE;
        AspectRatioOrientationButton aspectRatioOrientationButton = this.f45962a;
        e eVar2 = aspectRatioOrientationButton.f45960a;
        if (eVar2 != eVar) {
            e value = e.LANDSCAPE;
            if (eVar2 == value) {
                value = e.PORTRAIT;
            }
            Intrinsics.checkNotNullParameter(value, "value");
            if (value != aspectRatioOrientationButton.f45960a) {
                aspectRatioOrientationButton.f45960a = value;
                aspectRatioOrientationButton.a();
            }
            c(eVar);
        }
        Iterator it = this.f45963b.iterator();
        while (it.hasNext()) {
            AspectRatioButton aspectRatioButton = (AspectRatioButton) it.next();
            so soVar = aspectRatioButton.f45959b;
            if (soVar == null) {
                Intrinsics.r("aspectRatio");
                throw null;
            }
            if (Intrinsics.d(soVar, aspectRatio)) {
                aspectRatioButton.setSelected(true);
                this.f45964c = aspectRatioButton;
            } else {
                aspectRatioButton.setSelected(false);
            }
        }
    }

    public final void g(so soVar) {
        Object obj;
        Iterator it = this.f45963b.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            so soVar2 = ((AspectRatioButton) next).f45959b;
            if (soVar2 == null) {
                Intrinsics.r("aspectRatio");
                throw null;
            }
            if (soVar2 instanceof mo) {
                obj = next;
                break;
            }
        }
        AspectRatioButton aspectRatioButton = (AspectRatioButton) obj;
        if (!(soVar instanceof mo)) {
            c.X0(aspectRatioButton);
        } else if (aspectRatioButton != null) {
            aspectRatioButton.b(soVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinCreationAspectRatioSelector(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        AspectRatioOrientationButton aspectRatioOrientationButton = new AspectRatioOrientationButton(context2);
        this.f45962a = aspectRatioOrientationButton;
        this.f45963b = new ArrayList();
        final int i14 = 1;
        List<so> j13 = f0.j(new mo(-1, -1), lo.f39845e, ro.f41632e, po.f41036e, jo.f39102e, oo.f40759e);
        this.f45965d = j13;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        e(aspectRatioOrientationButton);
        aspectRatioOrientationButton.setOnClickListener(new View.OnClickListener(this) { // from class: xt0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IdeaPinCreationAspectRatioSelector f135908b;

            {
                this.f135908b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                IdeaPinCreationAspectRatioSelector.a(this.f135908b);
            }
        });
        linearLayout.addView(aspectRatioOrientationButton);
        for (so soVar : j13) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            final AspectRatioButton aspectRatioButton = new AspectRatioButton(context3);
            e(aspectRatioButton);
            aspectRatioButton.setOnClickListener(new View.OnClickListener(this) { // from class: xt0.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IdeaPinCreationAspectRatioSelector f135910b;

                {
                    this.f135910b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i142 = i14;
                    IdeaPinCreationAspectRatioSelector.b(this.f135910b, aspectRatioButton);
                }
            });
            aspectRatioButton.b(soVar);
            linearLayout.addView(aspectRatioButton);
            this.f45963b.add(aspectRatioButton);
        }
        addView(linearLayout);
    }
}
