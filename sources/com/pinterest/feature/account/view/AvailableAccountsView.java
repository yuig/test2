package com.pinterest.feature.account.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import b52.a;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import mr1.h;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/account/view/AvailableAccountsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AvailableAccountsView extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public b f45078a;

    /* renamed from: b, reason: collision with root package name */
    public final AccountSwitcherRowView f45079b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45080c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f45081d;

    /* renamed from: e, reason: collision with root package name */
    public List f45082e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableAccountsView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(b52.b.view_available_accounts, (ViewGroup) this, true);
        View findViewById = findViewById(a.active_account_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45079b = (AccountSwitcherRowView) findViewById;
        View findViewById2 = findViewById(a.switchable_accounts_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45080c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.switchable_accounts_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45081d = (LinearLayout) findViewById3;
    }

    public final void L(b bVar) {
        this.f45078a = bVar;
    }

    public final void T(ArrayList arrayList) {
        boolean z13 = !arrayList.isEmpty();
        GestaltText gestaltText = this.f45080c;
        if (z13) {
            a0.w1(gestaltText);
        } else {
            a0.k0(gestaltText);
        }
        boolean z14 = !arrayList.isEmpty();
        LinearLayout linearLayout = this.f45081d;
        c.R1(linearLayout, z14);
        linearLayout.removeAllViews();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            AccountSwitcherRowView accountSwitcherRowView = new AccountSwitcherRowView(context);
            accountSwitcherRowView.setId(t0.account_switcher_account_row);
            accountSwitcherRowView.L(hVar, false);
            accountSwitcherRowView.f45070c = this.f45078a;
            linearLayout.addView(accountSwitcherRowView);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableAccountsView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(b52.b.view_available_accounts, (ViewGroup) this, true);
        View findViewById = findViewById(a.active_account_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45079b = (AccountSwitcherRowView) findViewById;
        View findViewById2 = findViewById(a.switchable_accounts_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45080c = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.switchable_accounts_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45081d = (LinearLayout) findViewById3;
    }
}
