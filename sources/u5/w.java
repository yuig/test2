package u5;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class w extends i {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String type, Bundle data) {
        super(type, data);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type should not be empty".toString());
        }
    }
}
