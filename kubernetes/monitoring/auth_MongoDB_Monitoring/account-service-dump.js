/**
 * Creates pre-filled demo account
 */

print('set mongodb exporter user start');

db.getSiblingDB("admin").createUser({
  user: "mongodb_exporter",
  pwd: "s3cr3tpassw0rd",
  roles: [
    { role: "clusterMonitor", db: "admin" },
    { role: "read", db: "local" }
  ]
});

print('set mongodb exporter user complete');
