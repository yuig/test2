package pg0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends p0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f100053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, v7 board, String str) {
        super(board, str);
        this.f100053c = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(board, "board");
            super(board, str);
        } else if (i13 != 3) {
            Intrinsics.checkNotNullParameter(board, "board");
        } else {
            Intrinsics.checkNotNullParameter(board, "board");
            super(board, str);
        }
    }

    @Override // pg0.p0
    public final wa2.p a() {
        switch (this.f100053c) {
            case 0:
                return wa2.p.STATE_UNFOLLOWED_BOARD;
            case 1:
                return wa2.p.STATE_FILTER_BOARD_PINS;
            case 2:
                return wa2.p.STATE_UNFOLLOWED_INTEREST;
            case 3:
                return wa2.p.STATE_UNDO_FILTER_BOARD_PINS;
            case 4:
                return wa2.p.STATE_UNDO_UNFOLLOWED_INTEREST;
            case 5:
                return wa2.p.STATE_UNDO_UNFOLLOWED_USER;
            default:
                return wa2.p.STATE_UNFOLLOWED_USER;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(zs zsVar) {
        this(zsVar, (String) null, 2);
        this.f100053c = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zs interest, String str, int i13) {
        super(interest, str);
        this.f100053c = i13;
        if (i13 != 4) {
            Intrinsics.checkNotNullParameter(interest, "interest");
        } else {
            Intrinsics.checkNotNullParameter(interest, "interest");
            super(interest, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wy0 user, String str, int i13) {
        super(user, str);
        this.f100053c = i13;
        if (i13 != 6) {
            Intrinsics.checkNotNullParameter(user, "user");
        } else {
            Intrinsics.checkNotNullParameter(user, "user");
            super(user, str);
        }
    }
}
