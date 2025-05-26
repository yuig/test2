package com.pinterest.xrenderer.legacy.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import com.pinterest.xrenderer.legacy.render_view.GLRenderView;
import ha2.k;
import he2.j;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import jq.b;
import ke2.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import ld2.f;
import me2.a;
import org.jetbrains.annotations.NotNull;
import pd2.n;
import pd2.q0;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/xrenderer/legacy/view/LegacySceneView;", "Lcom/pinterest/xrenderer/legacy/render_view/GLRenderView;", "Lme2/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "renderer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LegacySceneView extends GLRenderView implements a {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLong f52891i = new AtomicLong(0);

    /* renamed from: h, reason: collision with root package name */
    public final c f52892h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacySceneView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        fe2.a factory = new fe2.a(4, context, this);
        Intrinsics.checkNotNullParameter(factory, "factory");
        if (this.f52884a != null) {
            throw new IllegalArgumentException("renderer factory is already set".toString());
        }
        this.f52884a = factory;
        f52891i.getAndIncrement();
        c cVar = new c();
        f type = f.DarkenBG;
        Intrinsics.checkNotNullParameter(type, "type");
        if (sd2.a.f112320e[type.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        cVar.f79318j = new g01.a(new od2.a("itemHighlight", "vec4 {{name}}(FragmentEffectInput data) {\n    int selectedItemID = {{settings.selectedItemID}};\n    if (selectedItemID < 0) {\n        return data.color;\n    }\n\n    vec4 color = data.color;\n    if (data.itemID != selectedItemID) {\n        color.rgb *= (1.0 - {{settings.bgShadow}});\n    }\n\n    return color;\n}", new q0(z0.g(new Pair("selectedItemID", new n(-1, null)), new Pair("bgShadow", b.n(0.5f, null, 0.0f, 1.0f))))));
        cVar.f79309a = true;
        this.f52892h = cVar;
    }

    @Override // me2.a
    public final CompletableFuture c(Point position, int i13) {
        Intrinsics.checkNotNullParameter(position, "position");
        return d(new k(position, i13));
    }

    @Override // me2.a
    /* renamed from: f, reason: from getter */
    public final c getF52892h() {
        return this.f52892h;
    }

    @Override // me2.a
    public final CompletableFuture i() {
        return d(j.f68994k);
    }

    @Override // me2.a
    public final CompletableFuture j() {
        return d(j.f68993j);
    }
}
