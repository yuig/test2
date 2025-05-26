package com.pinterest.ui.menu;

import android.content.Context;
import android.util.AttributeSet;
import ao2.k2;
import ao2.v0;
import cb2.p;
import dl2.b;
import ho2.q;
import java.util.concurrent.CancellationException;
import ko2.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/ui/menu/KotSpringLinearLayout;", "Lcom/pinterest/ui/menu/SpringLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "contextMenuLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class KotSpringLinearLayout extends SpringLinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52625h = 0;

    /* renamed from: g, reason: collision with root package name */
    public k2 f52626g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KotSpringLinearLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.menu.SpringLinearLayout
    public final void a() {
        k2 k2Var = this.f52626g;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }

    @Override // com.pinterest.ui.menu.SpringLinearLayout
    public final void c() {
        if (this.f52626g != null || this.f52630d) {
            return;
        }
        f fVar = v0.f20219a;
        this.f52626g = j.z(b.b(q.f69782a), null, null, new p(this, null), 3);
    }
}
