rootProject.name = "foobar-pay"

include(
    "foobar-pay-banking",
    "foobar-pay-banking:banking-dataaccess",
    "foobar-pay-banking:banking-service",
    "foobar-pay-core",
    "foobar-pay-money"
)