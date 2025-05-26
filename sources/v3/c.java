package v3;

import android.R;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public enum c {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);


    /* renamed from: id, reason: collision with root package name */
    private final int f123911id;
    private final int order;

    c(int i13) {
        this.f123911id = i13;
        this.order = i13;
    }

    public final int getId() {
        return this.f123911id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i13 = b.f123910a[ordinal()];
        if (i13 == 1) {
            return R.string.copy;
        }
        if (i13 == 2) {
            return R.string.paste;
        }
        if (i13 == 3) {
            return R.string.cut;
        }
        if (i13 == 4) {
            return R.string.selectAll;
        }
        throw new NoWhenBranchMatchedException();
    }
}
