package com.pinterest.identity.authentication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br1.e;
import br1.g;
import br1.h;
import com.pinterest.feature.pincarouselads.view.a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vq1.b;
import vq1.c;
import xk2.m;
import xk2.v;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/identity/authentication/view/SuggestedDomainsView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SuggestedDomainsView extends LinearLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f49827c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f49828a;

    /* renamed from: b, reason: collision with root package name */
    public final e f49829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedDomainsView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f49828a = m.b(g.f23790i);
        e eVar = new e();
        this.f49829b = eVar;
        View.inflate(getContext(), c.view_unauth_suggested_domains, this);
        View findViewById = findViewById(b.suggested_domains_rv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        a aVar = new a(this, 1);
        getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(aVar, 0, false));
        recyclerView.H2(eVar);
    }

    public final void a(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        HashMap hashMap = h.f23791a;
        String lowerCase = locale.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) hashMap.get(lowerCase);
        if (list == null) {
            list = h.f23792b;
        }
        e eVar = this.f49829b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        eVar.f23777d = list;
        eVar.h();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedDomainsView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        this.f49828a = m.b(g.f23790i);
        e eVar = new e();
        this.f49829b = eVar;
        View.inflate(getContext(), c.view_unauth_suggested_domains, this);
        View findViewById = findViewById(b.suggested_domains_rv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        g41.a aVar = new g41.a(this, 10);
        getContext();
        recyclerView.R2(new PinterestLinearLayoutManager(aVar, 0, false));
        recyclerView.H2(eVar);
    }
}
