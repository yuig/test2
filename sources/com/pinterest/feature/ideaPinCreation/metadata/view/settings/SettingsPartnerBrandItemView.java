package com.pinterest.feature.ideaPinCreation.metadata.view.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.feature.ideaPinCreation.metadata.view.settings.SettingsPartnerBrandItemView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import fv0.e;
import fv0.f;
import gm1.a;
import gm1.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import om1.l;
import org.jetbrains.annotations.NotNull;
import xk2.m;
import xk2.v;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/metadata/view/settings/SettingsPartnerBrandItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SettingsPartnerBrandItemView extends ConstraintLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final v f46547a;

    /* renamed from: b, reason: collision with root package name */
    public final v f46548b;

    /* renamed from: c, reason: collision with root package name */
    public final v f46549c;

    /* renamed from: d, reason: collision with root package name */
    public Function0 f46550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPartnerBrandItemView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46547a = m.b(new e(this, 1));
        this.f46548b = m.b(new e(this, 3));
        this.f46549c = m.b(new e(this, 0));
        final int i13 = 2;
        v b13 = m.b(new e(this, 2));
        this.f46550d = f.f63022i;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), aq1.f.view_idea_pin_section_partner_brand, this);
        ((GestaltIconButton) b13.getValue()).u(new a(this) { // from class: fv0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsPartnerBrandItemView f63019b;

            {
                this.f63019b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                SettingsPartnerBrandItemView.L(this.f63019b, cVar);
            }
        });
    }

    public static void L(SettingsPartnerBrandItemView this$0, c it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof l) {
            this$0.f46550d.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPartnerBrandItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i13 = 1;
        this.f46547a = m.b(new e(this, 1));
        this.f46548b = m.b(new e(this, 3));
        this.f46549c = m.b(new e(this, 0));
        v b13 = m.b(new e(this, 2));
        this.f46550d = f.f63022i;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), aq1.f.view_idea_pin_section_partner_brand, this);
        ((GestaltIconButton) b13.getValue()).u(new a(this) { // from class: fv0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsPartnerBrandItemView f63019b;

            {
                this.f63019b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                SettingsPartnerBrandItemView.L(this.f63019b, cVar);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPartnerBrandItemView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46547a = m.b(new e(this, 1));
        this.f46548b = m.b(new e(this, 3));
        final int i14 = 0;
        this.f46549c = m.b(new e(this, 0));
        v b13 = m.b(new e(this, 2));
        this.f46550d = f.f63022i;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View.inflate(getContext(), aq1.f.view_idea_pin_section_partner_brand, this);
        ((GestaltIconButton) b13.getValue()).u(new a(this) { // from class: fv0.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SettingsPartnerBrandItemView f63019b;

            {
                this.f63019b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                SettingsPartnerBrandItemView.L(this.f63019b, cVar);
            }
        });
    }
}
