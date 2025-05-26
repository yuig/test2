package o5;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f92900a = new e();

    @Override // o5.f
    public final int a(int i13, CharSequence charSequence) {
        int i14 = 2;
        for (int i15 = 0; i15 < i13 && i14 == 2; i15++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i15));
            h hVar = i.f92904a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i14 = 2;
                            break;
                    }
                }
                i14 = 0;
            }
            i14 = 1;
        }
        return i14;
    }
}
