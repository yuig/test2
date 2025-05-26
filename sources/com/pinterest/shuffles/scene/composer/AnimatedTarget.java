package com.pinterest.shuffles.scene.composer;

import android.graphics.PointF;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/pinterest/shuffles/scene/composer/AnimatedTarget;", "", "Lcom/pinterest/shuffles/scene/composer/a;", AnimatedTarget.PROPERTY_STATE, "", "setState", "(Lcom/pinterest/shuffles/scene/composer/a;)V", "getState", "()Lcom/pinterest/shuffles/scene/composer/a;", "Lke2/d;", "item", "Lke2/d;", "<init>", "(Lke2/d;)V", "Companion", "com/pinterest/shuffles/scene/composer/b", "shuffles-scene_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class AnimatedTarget {

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final String PROPERTY_STATE = "state";

    @NotNull
    private final ke2.d item;

    public AnimatedTarget(@NotNull ke2.d item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }

    @NotNull
    public final a getState() {
        ke2.d dVar = this.item;
        ke2.i iVar = dVar.f79319a;
        float f13 = iVar.f79339g;
        boolean z13 = f13 == 0.0f;
        ke2.b bVar = dVar.f79320b;
        return new a(f13, z13, bVar.f79304a, bVar.f79306c, bVar.f79307d, iVar.a());
    }

    public final void setState(@NotNull a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.item.f79319a.e(state.f51999b ? 0.0f : state.f51998a);
        ke2.b bVar = this.item.f79320b;
        PointF pointF = state.f52000c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pointF, "<set-?>");
        bVar.f79304a = pointF;
        ke2.b bVar2 = this.item.f79320b;
        hd2.a aVar = state.f52001d;
        bVar2.getClass();
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        bVar2.f79306c = aVar;
        ke2.b bVar3 = this.item.f79320b;
        ke2.a aVar2 = state.f52002e;
        bVar3.getClass();
        Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
        bVar3.f79307d = aVar2;
        this.item.f79319a.d(state.f52003f);
    }
}
