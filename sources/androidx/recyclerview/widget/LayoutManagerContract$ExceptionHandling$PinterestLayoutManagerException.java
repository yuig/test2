package androidx.recyclerview.widget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/recyclerview/widget/LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "framework-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException(String message, Exception originalException) {
        super(message, originalException);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(originalException, "originalException");
    }
}
