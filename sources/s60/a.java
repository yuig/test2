package s60;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111214i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f111215j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, int i13) {
        super(0);
        this.f111214i = i13;
        this.f111215j = str;
    }

    public final String b() {
        int i13 = this.f111214i;
        String str = this.f111215j;
        switch (i13) {
            case 2:
                return a.a.j("Failed to verify all uploaded assets. List of not processed assets: ", str);
            default:
                return str;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f111214i;
        String str = this.f111215j;
        switch (i13) {
            case 4:
                return Boolean.valueOf(str.length() > 0);
            case 5:
                return Boolean.valueOf(!(str == null || str.length() == 0));
            case 6:
                return Boolean.valueOf(!(str == null || str.length() == 0));
            case 7:
                return Boolean.valueOf(!(str == null || str.length() == 0));
            default:
                return Boolean.valueOf(str != null);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f111214i) {
        }
        return invoke();
    }
}
