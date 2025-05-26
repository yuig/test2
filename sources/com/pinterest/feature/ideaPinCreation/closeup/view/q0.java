package com.pinterest.feature.ideaPinCreation.closeup.view;

import com.pinterest.api.model.jq;
import com.pinterest.api.model.mq;
import com.pinterest.api.model.qq;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f46284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s0 f46285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(s0 s0Var, int i13) {
        super(1);
        this.f46284i = i13;
        this.f46285j = s0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f46284i;
        s0 s0Var = this.f46285j;
        switch (i13) {
            case 0:
                File file = (File) obj;
                if (file != null) {
                    gi2.b bVar = s0Var.f46320v;
                    String absolutePath = file.getAbsolutePath();
                    bVar.getClass();
                    qq overlayBlock = s0Var.f46299a;
                    Intrinsics.checkNotNullParameter(overlayBlock, "overlayBlock");
                    if (overlayBlock instanceof jq) {
                        ((jq) overlayBlock).m(absolutePath);
                    } else if (overlayBlock instanceof mq) {
                        ((mq) overlayBlock).l(absolutePath);
                    }
                }
                break;
            default:
                ((tb0.h) s0Var.f46309k.getValue()).q((Throwable) obj, "IdeaPinInteractiveGeneralStickerView: Error saving bitmap to file", tb0.p.IDEA_PINS_CREATION);
                break;
        }
        return Unit.f80348a;
    }
}
