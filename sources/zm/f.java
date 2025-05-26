package zm;

import kp.n;

/* loaded from: classes3.dex */
public final class f extends n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f142174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i13) {
        super(11);
        this.f142174d = i13;
    }

    @Override // kp.n
    public final int g0(char c13, StringBuilder sb3) {
        switch (this.f142174d) {
            case 0:
                if (c13 == ' ') {
                    sb3.append((char) 3);
                } else if (c13 >= '0' && c13 <= '9') {
                    sb3.append((char) (c13 - ','));
                } else {
                    if (c13 < 'a' || c13 > 'z') {
                        if (c13 < ' ') {
                            sb3.append((char) 0);
                            sb3.append(c13);
                            return 2;
                        }
                        if (c13 >= '!' && c13 <= '/') {
                            sb3.append((char) 1);
                            sb3.append((char) (c13 - '!'));
                            return 2;
                        }
                        if (c13 >= ':' && c13 <= '@') {
                            sb3.append((char) 1);
                            sb3.append((char) (c13 - '+'));
                            return 2;
                        }
                        if (c13 >= '[' && c13 <= '_') {
                            sb3.append((char) 1);
                            sb3.append((char) (c13 - 'E'));
                            return 2;
                        }
                        if (c13 == '`') {
                            sb3.append((char) 2);
                            sb3.append((char) (c13 - '`'));
                            return 2;
                        }
                        if (c13 >= 'A' && c13 <= 'Z') {
                            sb3.append((char) 2);
                            sb3.append((char) (c13 - '@'));
                            return 2;
                        }
                        if (c13 < '{' || c13 > 127) {
                            sb3.append("\u0001\u001e");
                            return 2 + g0((char) (c13 - 128), sb3);
                        }
                        sb3.append((char) 2);
                        sb3.append((char) (c13 - '`'));
                        return 2;
                    }
                    sb3.append((char) (c13 - 'S'));
                }
                return 1;
            default:
                if (c13 == '\r') {
                    sb3.append((char) 0);
                } else if (c13 == ' ') {
                    sb3.append((char) 3);
                } else if (c13 == '*') {
                    sb3.append((char) 1);
                } else if (c13 == '>') {
                    sb3.append((char) 2);
                } else if (c13 >= '0' && c13 <= '9') {
                    sb3.append((char) (c13 - ','));
                } else {
                    if (c13 < 'A' || c13 > 'Z') {
                        el.a.R(c13);
                        throw null;
                    }
                    sb3.append((char) (c13 - '3'));
                }
                return 1;
        }
    }

    @Override // kp.n
    public final int j0() {
        switch (this.f142174d) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // kp.n
    public final void r0(a8.a aVar, StringBuilder sb3) {
        switch (this.f142174d) {
            case 1:
                aVar.g(aVar.c());
                int c13 = ((d) aVar.f1281i).f142167b - aVar.c();
                aVar.f1274b -= sb3.length();
                String str = aVar.f1273a;
                if ((str.length() - aVar.f1276d) - aVar.f1274b > 1 || c13 > 1 || (str.length() - aVar.f1276d) - aVar.f1274b != c13) {
                    aVar.h((char) 254);
                }
                if (aVar.f1275c < 0) {
                    aVar.f1275c = 0;
                    break;
                }
                break;
            default:
                super.r0(aVar, sb3);
                break;
        }
    }

    @Override // kp.n, zm.b
    public final void s(a8.a aVar) {
        int i13;
        int i14 = this.f142174d;
        switch (i14) {
            case 1:
                StringBuilder sb3 = new StringBuilder();
                while (true) {
                    if (aVar.f()) {
                        char d2 = aVar.d();
                        aVar.f1274b++;
                        g0(d2, sb3);
                        int i15 = 3;
                        if (sb3.length() % 3 == 0) {
                            n.z0(aVar, sb3);
                            int i16 = aVar.f1274b;
                            switch (i14) {
                                case 0:
                                    i13 = 2;
                                    break;
                                default:
                                    i13 = 3;
                                    break;
                            }
                            int p23 = el.a.p2(i16, i13, aVar.f1273a);
                            switch (i14) {
                                case 0:
                                    i15 = 2;
                                    break;
                            }
                            if (p23 != i15) {
                                aVar.f1275c = 0;
                            }
                        }
                    }
                }
                r0(aVar, sb3);
                break;
            default:
                super.s(aVar);
                break;
        }
    }
}
