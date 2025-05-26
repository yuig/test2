package pm;

import com.google.gson.JsonIOException;

/* loaded from: classes3.dex */
public final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f100581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f100582b;

    public /* synthetic */ e(String str, int i13) {
        this.f100581a = i13;
        this.f100582b = str;
    }

    @Override // pm.p
    public final Object u() {
        int i13 = this.f100581a;
        String str = this.f100582b;
        switch (i13) {
            case 0:
                throw new JsonIOException(str);
            default:
                throw new JsonIOException(str);
        }
    }
}
