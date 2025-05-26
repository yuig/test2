package com.pinterest.feature.todaytab.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.api.model.f30;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/feature/todaytab/tab/view/TodayTabCustomCoverModule;", "Landroid/widget/FrameLayout;", "Lch1/b;", "Lnx/v;", "Lh32/c3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "todayTabLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TodayTabCustomCoverModule extends FrameLayout implements ch1.b, v {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f48650c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final WebImageView f48651a;

    /* renamed from: b, reason: collision with root package name */
    public dh1.e f48652b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabCustomCoverModule(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.custom_cover_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        final int i13 = 0;
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.custom_cover_module_pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48651a = (WebImageView) findViewById;
        setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.todaytab.tab.view.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TodayTabCustomCoverModule f48727b;

            {
                this.f48727b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                TodayTabCustomCoverModule this$0 = this.f48727b;
                switch (i14) {
                    case 0:
                        int i15 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar = this$0.f48652b;
                        if (eVar != null) {
                            eVar.t3(null);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar2 = this$0.f48652b;
                        if (eVar2 != null) {
                            eVar2.t3(null);
                            break;
                        }
                        break;
                    default:
                        int i17 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar3 = this$0.f48652b;
                        if (eVar3 != null) {
                            eVar3.t3(null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // ch1.b
    public final void D3(dh1.e eVar) {
        this.f48652b = eVar;
    }

    @Override // ch1.b
    public final void W5(List pins) {
        String y03;
        Intrinsics.checkNotNullParameter(pins, "pins");
        f30 f30Var = (f30) pins.get(0);
        if (f30Var == null || (y03 = bs1.c.y0(f30Var)) == null) {
            return;
        }
        this.f48651a.loadUrl(y03);
    }

    @Override // ch1.b
    public final void d() {
        this.f48651a.J1();
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        dh1.e eVar = this.f48652b;
        if (eVar != null) {
            return eVar.u3();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        dh1.e eVar = this.f48652b;
        if (eVar != null) {
            return eVar.v3();
        }
        return null;
    }

    @Override // ch1.b
    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabCustomCoverModule(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.custom_cover_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.custom_cover_module_pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48651a = (WebImageView) findViewById;
        final int i13 = 2;
        setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.todaytab.tab.view.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TodayTabCustomCoverModule f48727b;

            {
                this.f48727b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                TodayTabCustomCoverModule this$0 = this.f48727b;
                switch (i14) {
                    case 0:
                        int i15 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar = this$0.f48652b;
                        if (eVar != null) {
                            eVar.t3(null);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar2 = this$0.f48652b;
                        if (eVar2 != null) {
                            eVar2.t3(null);
                            break;
                        }
                        break;
                    default:
                        int i17 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar3 = this$0.f48652b;
                        if (eVar3 != null) {
                            eVar3.t3(null);
                            break;
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TodayTabCustomCoverModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o92.c.custom_cover_today_article_module, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipToPadding(false);
        View findViewById = findViewById(o92.b.custom_cover_module_pin_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48651a = (WebImageView) findViewById;
        final int i14 = 1;
        setOnClickListener(new View.OnClickListener(this) { // from class: com.pinterest.feature.todaytab.tab.view.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TodayTabCustomCoverModule f48727b;

            {
                this.f48727b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                TodayTabCustomCoverModule this$0 = this.f48727b;
                switch (i142) {
                    case 0:
                        int i15 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar = this$0.f48652b;
                        if (eVar != null) {
                            eVar.t3(null);
                            break;
                        }
                        break;
                    case 1:
                        int i16 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar2 = this$0.f48652b;
                        if (eVar2 != null) {
                            eVar2.t3(null);
                            break;
                        }
                        break;
                    default:
                        int i17 = TodayTabCustomCoverModule.f48650c;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        dh1.e eVar3 = this$0.f48652b;
                        if (eVar3 != null) {
                            eVar3.t3(null);
                            break;
                        }
                        break;
                }
            }
        });
    }
}
