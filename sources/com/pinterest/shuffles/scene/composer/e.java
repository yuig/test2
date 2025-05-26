package com.pinterest.shuffles.scene.composer;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.p implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i13) {
        super(0, obj, f.class, "getCanvasWidth", "getCanvasWidth()I", 0);
        this.f52030a = i13;
        if (i13 == 1) {
            super(0, obj, f.class, "getCanvasWidth", "getCanvasWidth()I", 0);
            return;
        }
        if (i13 == 2) {
            super(0, obj, f.class, "getCanvasWidth", "getCanvasWidth()I", 0);
        } else if (i13 != 3) {
        } else {
            super(0, obj, f.class, "getCanvasWidth", "getCanvasWidth()I", 0);
        }
    }

    public final Integer h() {
        switch (this.f52030a) {
        }
        return Integer.valueOf(((f) this.receiver).d().getWidth());
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f52030a) {
        }
        return h();
    }
}
