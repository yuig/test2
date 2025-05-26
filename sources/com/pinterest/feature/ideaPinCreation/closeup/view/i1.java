package com.pinterest.feature.ideaPinCreation.closeup.view;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class i1 implements o0, v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IdeaPinOverlayViewColorPickerModal f46199b;

    public /* synthetic */ i1(IdeaPinOverlayViewColorPickerModal ideaPinOverlayViewColorPickerModal, int i13) {
        this.f46198a = i13;
        this.f46199b = ideaPinOverlayViewColorPickerModal;
    }

    @Override // com.pinterest.feature.ideaPinCreation.closeup.view.o0
    public final void e(Bitmap bitmap) {
        int i13 = this.f46198a;
        IdeaPinOverlayViewColorPickerModal this$0 = this.f46199b;
        switch (i13) {
            case 0:
                int i14 = IdeaPinOverlayViewColorPickerModal.f46009u;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46012c.setImageBitmap(bitmap);
                break;
            default:
                int i15 = IdeaPinOverlayViewColorPickerModal.f46009u;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f46012c.setImageBitmap(bitmap);
                bs1.c.U1(this$0.f46012c);
                break;
        }
    }
}
