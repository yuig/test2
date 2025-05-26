package tm;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class g extends qm.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f118119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i13, Class cls) {
        super(cls);
        this.f118119c = i13;
    }

    @Override // qm.g
    public final Date c(Date date) {
        switch (this.f118119c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
