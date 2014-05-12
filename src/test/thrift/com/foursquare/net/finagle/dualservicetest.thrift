namespace java com.foursquare.net.finagle

// Simple service used by the DualServiceTest integration test.
service DualService {
  i32 add(1: i32 x, 2: i32 y)

  string trace()
}

